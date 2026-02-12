package MethodOverriding;

public class C_02_ChildClass extends C_01_ParentClass {
	public void display() {
		 System.out.println("This is Parent class display method");
	 }
	 public void show() {
		 System.out.println("This is Parent class show method");
	 }

	public static void main(String[] args) {
		C_02_ChildClass obj1 =  new C_02_ChildClass();
		obj1.display();
		obj1.show();
		obj1.disp();
		
		C_01_ParentClass obj2 =  new C_01_ParentClass();
		obj2.display();
		obj2.show();
		
		C_01_ParentClass obj3 =  new C_01_ParentClass();
		obj3.display();
		obj3.show();

	}

}
