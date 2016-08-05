package notepad;

import java.util.Scanner;

public class SecuredNotepad extends Notepad {
	
	protected static final String CHECK_PASS_MESSAGE = "Enter password";
	private String password;
	static Scanner sc = new Scanner(System.in);
	
	
	public SecuredNotepad(int pages, String password) {
		super(pages);
		this.password = password;

	}

	private boolean checkPassword(String password){
		return this.password.equals(password);
	}
	
	private boolean checkIsPasswordStrong(String password){
		return this.checkPassword(password) && SecuredNotepad.isPasswordStrong(password);
	}
	
	
	@Override
	public void addText(int page, String text) {
		System.out.println(CHECK_PASS_MESSAGE);
		String pass = SecuredNotepad.sc.next();
		if(checkIsPasswordStrong(pass)){
			super.addText(page, text);
		}
		else{
			System.out.println("You have entered invalid password");
		}
	}
	
	@Override
	public void addNewText(int page, String text) {
		System.out.println(CHECK_PASS_MESSAGE);
		String pass = sc.next();
		if(checkIsPasswordStrong(pass)){
			super.addNewText(page, text);
		}
		else{
			System.out.println("You have entered invalid password");
		}
	}
	
	@Override
	public void deleteText(int page) {
		System.out.println(CHECK_PASS_MESSAGE);
		String pass = sc.next();
		if(checkIsPasswordStrong(pass)){
			super.deleteText(page);
		}
		else{
			System.out.println("You have entered invalid password");
		}
	}
	
	@Override
	public void printAllPages() {
		System.out.println(CHECK_PASS_MESSAGE);
		String pass = sc.next();
		if(checkIsPasswordStrong(pass)){
			super.printAllPages();
		}
		else{
			System.out.println("You have entered invalid password");
		}
	}
	
	@Override
	public boolean searchWord(String word) {
		System.out.println(CHECK_PASS_MESSAGE);
		String pass = sc.next();
		if(checkIsPasswordStrong(pass)){
			return super.searchWord(word);
		}
		
		System.out.println("You have entered invalid password");
		return false;
	}
	
	@Override
	public void printAllPagesWithDigits() {
		System.out.println(CHECK_PASS_MESSAGE);
		String pass = sc.next();
		if(checkIsPasswordStrong(pass)){
			super.printAllPagesWithDigits();
		}
		else{
			System.out.println("You have entered invalid password");
		}
	}
	
	public static boolean isPasswordStrong(String pass){
		boolean upper = false;
		boolean lower = false;
		boolean number = false;
		
		for (int i = 0; i < pass.length(); i++) {
			if (upper == false && pass.charAt(i) >= 65 && pass.charAt(i) <= 90) {
				upper = true;
			}
			if (lower == false && pass.charAt(i) >= 97 && pass.charAt(i) <= 122) {
				lower = true;
			}
			if (number == false && pass.charAt(i) >= 48 && pass.charAt(i) <= 57) {
				number = true;
			}

			if (number && upper && lower) {
				return true;
			}
		
		}
		System.out.println("You password is week");
		return false;
		
	}
	
	

}
