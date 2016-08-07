package musicInstruments;

public abstract class MusicInstrument implements Comparable<MusicInstrument>{

	private String name;
	private int price;
	private int numberInShop;
	private int sellCount;
	private int moneyTotalOfSells;
	
	public MusicInstrument(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	
	public void setMoneyTotalOfSells(int moneyTotalOfSells) {
		this.moneyTotalOfSells = moneyTotalOfSells;
	}
	
	public int getMoneyTotalOfSells() {
		return moneyTotalOfSells;
	}
	
	public int getSellCount() {
		return sellCount;
	}
	
	public void setSellCount(int sellCount) {
		this.sellCount = sellCount;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
	}

	public void setNumberInShop(int numberInShop) {
		this.numberInShop = numberInShop;
	}

	public int getPrice() {
		return price;
	}
	
	public int getNumberInShop() {
		return numberInShop;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(MusicInstrument mi) {
		return this.name.compareTo(mi.name);
	}
	
}
