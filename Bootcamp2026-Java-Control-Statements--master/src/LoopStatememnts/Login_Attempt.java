package LoopStatememnts;

public class Login_Attempt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attempts = 1;
		while(attempts <= 3) {
			System.out.println("Attempt " + attempts + ": Trying to login...");
			attempts++;
		}
		System.out.println("Accounts locked!");
	}
	

}
