package AccessModifiers;
class B{
	int x = 10;
	public void b1() {
		System.out.println("This is public method");
	}
	protected int z = 200;
	protected void ProtectedMethod() {
		System.out.println("This is protected method");
	}
}
public class C_02_Default {

	public static void main(String[] args) {
		B obj = new B();
		int output = obj.x;
		System.out.println("Output is : "+ output);
		obj.b1();
		obj.ProtectedMethod();
		

	}

}
