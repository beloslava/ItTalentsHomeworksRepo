package notepad;

public class Page {

	private String title;
	private StringBuilder text;
	
	public Page(){
		this.title = "Unnamed title";
		this.text = new StringBuilder("");
	}
	
	public void setTitle(String title) {
		if(!title.equals("") && title != null){
			this.title = title;
		}
	}

	public void addText(String text){
		if(text != null){
			this.text.append(text);
		}
	}
	
	public void deleteText(){
		this.text.delete(0, text.length());
	}
	
	public void printPage(){
		System.out.println(this.title + "\n" + this.text);
	}
	
	public boolean searchWord(String word){
		String stringedText = this.text.toString().toLowerCase();
		
		return word != null && stringedText.indexOf(word.toLowerCase()) != -1;

	}
	
	public boolean isPageContainsDigits(){
		String stringedText = this.text.toString();
		for (int i = 0; i < stringedText.length(); i++) {
			if(stringedText.charAt(i) >= 48 && stringedText.charAt(i) <= 57){
				return true;
			}
		}
		return false;
	}
}
