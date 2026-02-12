package LoopStatememnts;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password= "";
		
		while(!password.equals("admin123")) {
			System.out.print("Enter password: ");
			password = sc.nextLine();
		}
		System.out.println("Acces Granted!");
		sc.close();
	}

}
