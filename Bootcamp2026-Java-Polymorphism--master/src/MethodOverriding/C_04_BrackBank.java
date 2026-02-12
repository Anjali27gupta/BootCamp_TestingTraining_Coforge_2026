package MethodOverriding;

public class C_04_BrackBank extends C_03_BDBank_Parent{
	public void CoforgeLoanRate() {
		System.out.println(" BD Bank Coforge loan rate is 8%");
	}

	public static void main(String[] args) {
		C_03_BDBank_Parent obj1 = new C_03_BDBank_Parent();
		obj1.CoforgeLoanRate();
		C_04_BrackBank obj2 = new C_04_BrackBank();
		obj2.CoforgeLoanRate();

	}

}
