package musicShop;

import musicInstruments.BrassedInstrument;
import musicInstruments.KeybordedInstrument;
import musicInstruments.MusicInstrument;
import musicInstruments.StringedInstrument;

public class Demo {

	public static void main(String[] args) {
		
		MusicInstrument arfa = new StringedInstrument("arfa", 350);
		MusicInstrument guitar = new StringedInstrument("guitar", 600);
		MusicInstrument organ = new KeybordedInstrument("organ", 1000);
		MusicInstrument tube = new BrassedInstrument("tube", 400);
		MusicInstrument piano = new KeybordedInstrument("piano", 2000);
		
		MusicShopRnR musicShop = new MusicShopRnR(1000);
		musicShop.addMusicInstrument(piano, 2);
		musicShop.addMusicInstrument(tube, 5);
		musicShop.addMusicInstrument(organ, 1);
		musicShop.addMusicInstrument(guitar, 5);
		musicShop.addMusicInstrument(arfa, 2);
		
		System.out.println(musicShop.instrumentsInShop);
		System.out.println(musicShop.getCashDeskMoney());
		
		musicShop.sellMusicInstrument(piano, 2);
		System.out.println(musicShop.getCashDeskMoney());
		musicShop.makeCatalogue(MusicShopRnR.Catalogue.NAME);
		musicShop.makeCatalogue(MusicShopRnR.Catalogue.PRICE);
		musicShop.sellMusicInstrument(tube, 3);
		System.out.println(musicShop.getCashDeskMoney());
		musicShop.makeCatalogue(MusicShopRnR.Catalogue.IN_SHOP);
		musicShop.makeCatalogue(MusicShopRnR.Catalogue.TYPE);
		System.out.println("=======================");
		musicShop.doShopReport(MusicShopRnR.Report.SELLS_NUMBER);
		musicShop.doShopReport(MusicShopRnR.Report.TOTAL_MONEYSELLS);
		musicShop.doShopReport(MusicShopRnR.Report.MOST_BUYABLE);
		musicShop.doShopReport(MusicShopRnR.Report.MOST_UNBUYABLE);
		musicShop.doShopReport(MusicShopRnR.Report.MOST_SELLABLE_TYPE);
		musicShop.doShopReport(MusicShopRnR.Report.MOST_SELLABLE);

	}
	
}
