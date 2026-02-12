package com.Coforge.construstor;

public class DefaultConstructor {
	public DefaultConstructor() {
		System.out.println("This is the constructor block");
	}
	public void method() {
		System.out.println("This is the method block");
	}
	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
		obj.method();

	}

}
