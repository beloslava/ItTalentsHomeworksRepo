package notepad;

public interface INotepad {
	
	static final int DEFAULT_NUMBER_OF_PAGES = 10;
	void addText(int page, String text);
	void addNewText(int page, String text);
	void deleteText(int page);
	void printAllPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();

}
