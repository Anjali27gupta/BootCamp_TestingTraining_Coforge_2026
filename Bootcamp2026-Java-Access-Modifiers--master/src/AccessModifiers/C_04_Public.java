package AccessModifiers;

public class C_04_Public extends B {

	public static void main(String[] args) {
		C_04_Public obj = new C_04_Public();
		int output = obj.x;
		System.out.println("Value of x: " + output);
		obj.b1();
		
	}

}
