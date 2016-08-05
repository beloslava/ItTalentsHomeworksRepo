package notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice{
	
	private boolean isOn;
	

	public ElectronicSecuredNotepad(int pages, String password) {
		super(pages, password);
		this.isOn = false;
	}

	@Override
	public void start() {
		this.isOn = true;
	}

	@Override
	public void stop() {
		this.isOn = false;
	}

	@Override
	public boolean isStarted() {
		return this.isOn;
	}
	
	@Override
	public void addText(int page, String text) {
		if(isOn){
			super.addText(page, text);
		}
		else{
			System.out.println("Your notebookk is off");
		}
	}
	
	@Override
	public void addNewText(int page, String text) {
		if(isOn){
			super.addNewText(page, text);
		}
		else{
			System.out.println("Your notebook is off");
		}
	}
	
	@Override
	public void deleteText(int page) {
		if(isOn){
			super.deleteText(page);
		}
		else{
			System.out.println("Your notebook is off");
		}
	}
	
	@Override
	public void printAllPages() {
		if(isOn){
			super.printAllPages();
		}
		else{
			System.out.println("Your notebook is off");
		}
	}
	
	@Override
	public boolean searchWord(String word) {
		if(isOn){
			return super.searchWord(word);
		}
		System.out.println("Your notebook is off");
		return false;
	}
	
	@Override
	public void printAllPagesWithDigits() {
		if(isOn){
			super.printAllPagesWithDigits();
		}
		else{
			System.out.println("Your notebook is off");
		}
	}

}
