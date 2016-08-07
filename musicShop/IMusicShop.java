package musicShop;

import musicInstruments.MusicInstrument;
import musicShop.MusicShopRnR.Catalogue;
import musicShop.MusicShopRnR.Report;

public interface IMusicShop {

	void sellMusicInstrument(MusicInstrument name, int number);
	void addMusicInstrument(MusicInstrument name, int number);
	void makeCatalogue(Catalogue c);
	void doShopReport(Report r);
	
}
