package com.Coforge.construstor;

public class C_02_CoverloadingArumentType {
	public  C_02_CoverloadingArumentType(int a , int b) {
		int c =a+b;
		System.out.println("Summation is: " +c);
		}
	public  C_02_CoverloadingArumentType(double a , double b) {
		double c =a+b;
		System.out.println("Summation is: " +c);
		}
	public void display() {
		System.out.println("Constructor overloading is working successfully");
	}
	
	public static void main(String[] args) {
	
		C_02_CoverloadingArumentType obj1 = new C_02_CoverloadingArumentType(10,20);
		obj1.display();
		C_02_CoverloadingArumentType obj2 = new C_02_CoverloadingArumentType(20.55,20.34);
		obj2.display();
	}

}
