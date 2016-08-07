package musicShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.concurrent.BrokenBarrierException;
import java.util.TreeMap;

import musicInstruments.BrassedInstrument;
import musicInstruments.ElectronicInstrument;
import musicInstruments.KeybordedInstrument;
import musicInstruments.MusicInstrument;
import musicInstruments.PercusionedInstrument;
import musicInstruments.StringedInstrument;

public class MusicShopRnR implements IMusicShop {

	enum Catalogue {NAME, TYPE, PRICE, IN_SHOP};
	enum Report {SELLS_NUMBER, TOTAL_MONEYSELLS, MOST_BUYABLE, MOST_UNBUYABLE, MOST_SELLABLE_TYPE, MOST_SELLABLE};

	private int cashDeskMoney;
	TreeMap<String, MusicInstrument> instrumentsInShop;

	public int getCashDeskMoney() {
		return cashDeskMoney;
	}

	public MusicShopRnR(int cashDeskMoney) {
		if (cashDeskMoney > 0) {
			this.cashDeskMoney = cashDeskMoney;
		}
		instrumentsInShop = new TreeMap<>();
	}
	
	@Override
	public void sellMusicInstrument(MusicInstrument instrument, int number) {
		if ((instrumentsInShop.get(instrument.getName()).getNumberInShop()) == number) {
			instrumentsInShop.get(instrument.getName()).setNumberInShop(0);
			cashDeskMoney += (instrument.getPrice() * number);
			instrument.setSellCount(number);
			instrument.setMoneyTotalOfSells(instrument.getPrice() * number);
		}
		if ((instrumentsInShop.get(instrument.getName()).getNumberInShop()) < number) {
			System.out.println("There is not enough instruments of that type");
		}
		if ((instrumentsInShop.get(instrument.getName()).getNumberInShop()) > number) {
			instrumentsInShop.get(instrument.getName()).setNumberInShop(instrument.getNumberInShop() - number);
			cashDeskMoney += (instrument.getPrice() * number);
			instrument.setSellCount(number);
			instrument.setMoneyTotalOfSells(instrument.getPrice() * number);
		}
	}

	@Override
	public void addMusicInstrument(MusicInstrument instrument, int number) {
		instrumentsInShop.put(instrument.getName(), instrument);
		instrumentsInShop.get(instrument.getName()).setNumberInShop(number);

	}

	@Override
	public void makeCatalogue(Catalogue c) {

		switch (c) {
		case NAME:
			System.out.println("---- Music Instruments in Shop by " + c +" ----");
			for (String name : instrumentsInShop.keySet()) {
				System.out.println("	- " + name);
			}
			break;
		case PRICE:

			ArrayList<MusicInstrument> list = new ArrayList<>(instrumentsInShop.values());
			Collections.sort(list, new Comparator<MusicInstrument>() {

				@Override
				public int compare(MusicInstrument o1, MusicInstrument o2) {
					return o1.getPrice() - o2.getPrice();
				}
			});
			System.out.println("---- Music Instruments in Shop by " + c +" ----");
			for (MusicInstrument a : list) {
				System.out.println("	- " + a.getName() + ", price: " + a.getPrice());
			}
			break;
		case IN_SHOP:
			System.out.println("---- Music Instruments in Shop by " + c +" ----");
			for (MusicInstrument instrument : instrumentsInShop.values()) {
				if (instrument.getNumberInShop() != 0) {
					System.out.println("	- " + instrument.getName());
				}
			}
			break;
		case TYPE:
			System.out.println("---- Music Instruments in Shop by " + c +" ----");
			ArrayList<MusicInstrument> list2 = new ArrayList<>(instrumentsInShop.values());
			Collections.sort(list2, new Comparator<MusicInstrument>(){
				@Override
				public int compare(MusicInstrument arg0, MusicInstrument arg1) {
					return arg0.getClass().getName().compareTo(arg1.getClass().getName());
				}

			});
			for (MusicInstrument a : list2) {
				System.out.println("	- " + a.getName() + ", type: " + a.getClass().getName());
			}
			break;
		}

	}

	@Override
	public void doShopReport(Report r) {
		System.out.println("---- Report " + r + " ----");
		ArrayList<MusicInstrument> list = new ArrayList<>(instrumentsInShop.values());
		switch (r) {
		case SELLS_NUMBER:
			Collections.sort(list, new Comparator<MusicInstrument>(){
				@Override
				public int compare(MusicInstrument arg0, MusicInstrument arg1) {
					return arg1.getSellCount() - arg0.getSellCount();
				}
			});
			for (MusicInstrument musicInstrument : list) {
				System.out.println(musicInstrument.getName() + " sells: " + musicInstrument.getSellCount());
			}
			break;
		case TOTAL_MONEYSELLS:
			int total = 0;
			for (MusicInstrument musicInstrument : list) {
				total += musicInstrument.getMoneyTotalOfSells();
			}
			System.out.println("Total money from sold instruments: " + total);
			break;
		case MOST_BUYABLE:
			Collections.sort(list, new Comparator<MusicInstrument>(){
				@Override
				public int compare(MusicInstrument arg0, MusicInstrument arg1) {
					return arg1.getSellCount() - arg0.getSellCount();
				}
			});
			int count = 0;
			for (MusicInstrument musicInstrument : list) {
				System.out.println(musicInstrument.getName() + " - sells: " + musicInstrument.getSellCount());
				count++;
				if(count == 1){
					break;
				}
			}
			break;
		case MOST_UNBUYABLE:
			int sells = 0;
			MusicInstrument unbuyable;
			
			for (MusicInstrument musicInstrument : list) {
				if(musicInstrument.getSellCount() < sells){
					sells = musicInstrument.getSellCount();
					unbuyable = musicInstrument;
					
				} 
			}
			for (MusicInstrument musicInstrument : list) {
				if(musicInstrument.getSellCount() == sells){
					System.out.println("Music instrument: " + musicInstrument + ", sells: " + sells);
					break;
				}
			}
			
			break;
		case MOST_SELLABLE_TYPE:
			TreeMap<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					return o2 - o1;
				}
			});
			
			int b = 0;
			int e = 0;
			int k = 0;
			int p = 0;
			int s = 0;
			
			for (MusicInstrument musicInstrument : list) {
				if(musicInstrument instanceof BrassedInstrument){
					b+=musicInstrument.getSellCount();
				}
				if(musicInstrument instanceof ElectronicInstrument){
					e+=musicInstrument.getSellCount();
				}
				if(musicInstrument instanceof KeybordedInstrument){
					k+=musicInstrument.getSellCount();
				}
				if(musicInstrument instanceof PercusionedInstrument){
					p+=musicInstrument.getSellCount();
				}
				if(musicInstrument instanceof StringedInstrument){
					s+=musicInstrument.getSellCount();
				}
			}
			map.put(b, "Brassed instruments");
			map.put(e, "Electronic instruments");
			map.put(k, "Keyboarded instruments");
			map.put(p, "Percusioned instruments");
			map.put(s, "Stringed instruments");
			
			int num = 0;
			for (Entry<Integer, String> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " sells - " + entry.getValue());
				num++;
				if(num > 0){
					break;
				}
			}
			
			break;
		case MOST_SELLABLE:
			TreeMap<Integer, String> map2 = new TreeMap<>(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					return o2 - o1;
				}
			});
			b = 0;
			e = 0;
			k = 0;
			p = 0;
			s = 0;
			
			for (MusicInstrument musicInstrument : list) {
				if(musicInstrument instanceof BrassedInstrument){
					b+=musicInstrument.getMoneyTotalOfSells();
				}
				if(musicInstrument instanceof ElectronicInstrument){
					e+=musicInstrument.getMoneyTotalOfSells();
				}
				if(musicInstrument instanceof KeybordedInstrument){
					k+=musicInstrument.getMoneyTotalOfSells();
				}
				if(musicInstrument instanceof PercusionedInstrument){
					p+=musicInstrument.getMoneyTotalOfSells();
				}
				if(musicInstrument instanceof StringedInstrument){
					s+=musicInstrument.getMoneyTotalOfSells();
				}
			}
			map2.put(b, "Brassed instruments");
			map2.put(e, "Electronic instruments");
			map2.put(k, "Keyboarded instruments");
			map2.put(p, "Percusioned instruments");
			map2.put(s, "Stringed instruments");
			int num2 = 0;
			for (Entry<Integer, String> entry : map2.entrySet()) {
				System.out.println(entry.getKey() + " money form sells - " + entry.getValue());
				num2++;
				if(num2 > 0){
					break;
				}
			}
			break;
		}
		

	}

	

}
