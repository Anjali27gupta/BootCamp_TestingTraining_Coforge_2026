package MethodOverLoading;

class Payment {
	void pay(int amount) {
		System.out.println("Paying cash: "+ amount);
	}
	void pay(int amount,String cardType) {
		System.out.println("Paying cash: "+ amount+" using " + cardType);
	}
	void pay(double amount) {
		System.out.println("Paying online: "+ amount);
	}
}
public class DemoMethodOver{
	public static void main(String[] args) {
		Payment p = new Payment();
		p.pay(1000);
		p.pay(2500, "Credit Card");
		p.pay(1999.99);

	}
}




