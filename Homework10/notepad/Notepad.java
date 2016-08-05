package notepad;

public abstract class Notepad implements INotepad{

	private Page[] pages;
	
	public Notepad(int pages) {
		if (pages <= 0) {
			pages = DEFAULT_NUMBER_OF_PAGES;
		}
		this.pages = new Page[pages];
		for (int i = 0; i < this.pages.length; i++) {
			this.pages[i] = new Page();
		}
	}
	
	@Override
	public void addText(int page, String text) {
		if(isInputOK(page, text)){
			this.pages[page-1].addText(text);
		}
	}

	@Override
	public void addNewText(int page, String text) {
		if(isInputOK(page, text)){
			this.pages[page-1].deleteText();
			this.pages[page-1].addText(text);
		}
		
	}

	@Override
	public void deleteText(int page) {
		if(isInputPageOK(page)){
			this.pages[page-1].deleteText();
		}
	}

	@Override
	public void printAllPages() {
		for (int i = 0; i < pages.length; i++) {
			this.pages[i].printPage();
		}
	}

	@Override
	public boolean searchWord(String word) {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i].searchWord(word)){
				System.out.println("There is a word " + word + " in the Notebook");
				return true;
			}
		}
		System.out.println("There is not a word " + word + " in the Notebook");
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i].isPageContainsDigits()){
				pages[i].printPage();
			}
		}
	}
	
	private boolean isInputPageOK(int page) {
		return page < this.pages.length && page > 0;

	}

	private boolean isInputOK(int page, String text) {
		return (page < this.pages.length && page > 0 && text != null && !(text.equals("")));

	}

}
