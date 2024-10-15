package practice;

public class SamplClass {
	int num3 = 7;
	int num1 = 7;
	int num2 = 9;

	// static - It can be accessed without creating an object of the class
	static void multiply() {
		System.out.println("multiply");
	}

	// public - which can only be accessed by objects
	public void minus() {
		System.out.println("minus");
	}

	public static void main(String[] args) {
		SamplClass samp = new SamplClass();
		System.out.println("num3 = " + samp.num3);
		multiply();
		samp.minus();
		calculator calc = new calculator();
		int result = calc.add(samp.num1, samp.num2);
		System.out.println("result = " + result);
	}
}

class calculator {
	int a;

	public int add(int num1, int num2) {
		int r = num1 + num2;
		return r;
	}
}
