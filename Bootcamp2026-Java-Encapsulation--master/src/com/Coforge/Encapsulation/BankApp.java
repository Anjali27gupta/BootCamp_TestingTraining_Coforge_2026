package com.Coforge.Encapsulation;

class BankAccount {
	private Double balance ;
	 public void setBalance (double amount) {
		 if (amount > 0) {
			 balance = amount;
			 
		 }
	 }
	  public double getBalance() {
		  return balance ;
		  
	  }
}

public class BankApp {

	public static void main(String[] args) {
		 BankAccount acc = new BankAccount();
		 acc.setBalance(10000);
		 System.out.println("balance: "+ acc.getBalance());
	
	}
}
