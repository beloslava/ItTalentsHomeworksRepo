package musicShop;

import java.util.Comparator;

import musicInstruments.MusicInstrument;

public class ComparatorByTotalPrice implements Comparator<MusicInstrument>{

	@Override
	public int compare(MusicInstrument o1, MusicInstrument o2) {
		return o1.getMoneyTotalOfSells() - o2.getMoneyTotalOfSells();
	}

}
