package assignment5;
// WAP in Java using Constructors for car tutorial 
public class CarTutorial {
	public CarTutorial(String name) {
		System.out.println("Car credentials verified");
		System.out.println("Driver "+name+" is ready to drive");
	}
	void start() {
		System.out.println("Car started");
	}
	void seatbelt() {
		System.out.println("Wear Seatbelt");
	}
	void clutchGear() {
		System.out.println("Clutch pressed and gear applied");
	}
	void accelerate() {
		System.out.println("Car accelerated");
	}
	void steer() {
		System.out.println("Steering handled");
	}
	void brake() {
		System.out.println("Brake applied");
	}
	void stop() {
		System.out.println("Car stopped");
	}
	
	public static void main(String[] args) {
		CarTutorial car1= new CarTutorial("XYZ");
		   car1.start();
	       car1.seatbelt();
	       car1.clutchGear();
	       car1.accelerate();
	       car1.steer();
	       car1.brake();
	       car1.stop();
	       System.out.println();
	   
	}

}
