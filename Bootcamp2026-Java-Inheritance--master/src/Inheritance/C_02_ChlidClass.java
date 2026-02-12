package Inheritance;

public class C_02_ChlidClass extends C_01_BaseClass {
	public void mul() {
		System.out.println("Multipication is 250");

	}
	public void div() {
	  System.out.println("Substraction is 100");
	}
	public static void main(String[] args) {
			C_02_ChlidClass obj1= new C_02_ChlidClass();
			  obj1.add();
			  obj1.subs();
			  obj1.mul();
			  obj1.div();
			  System.out.println("===========");
			   
			  C_01_BaseClass obj2= new C_01_BaseClass();
			  obj2.add();
			  obj2.subs();
			  System.out.println("======================");
		  }
}

