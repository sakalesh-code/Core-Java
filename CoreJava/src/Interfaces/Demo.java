package Interfaces;

public class Demo {
	public static void main(String[] args) {
		Car car = new Bike();
		car.start();
		car.sound();
		Vehicle2 v = new Car2();
		v.start2();
		System.out.println(Vehicle2.age);
		v.show();
		v.start();

	}
}

//The interface in Java is a mechanism to achieve abstraction. 
//Traditionally, an interface could only have abstract methods (methods without a body)
interface Vehicle {
	int age = 22; // public, static, and final variables by default

	void start();

	void sound();

	default void show() {
		// Print statement
		System.out.println("Default API");
	}
}

class Car implements Vehicle {
	public void start() {
		System.out.println("started ... ");
	}

	public void sound() {
		System.out.println("sound ... ");
	}
}

class Bike extends Car {
	public void sound() {
		System.out.println("sound ... ");
	}
}

interface Vehicle2 extends Vehicle {
	void start2();
}

class Car2 implements Vehicle2 {
	public void start2() {
		System.out.println("started2 ... ");
	}

	@Override
	public void start() {
		System.out.println("started ..car2.. ");

	}

	@Override
	public void sound() {
		System.out.println("sound ..car2.. ");

	}

}