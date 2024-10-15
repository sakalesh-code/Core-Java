package practice;

public class LambdaExpression {
	// Lambda Expressions were added in Java 8.
	// A lambda expression is a short block of code which takes in parameters and returns a value.
	// Lambda expressions are similar to methods,
	// but they do not need a name and they can be implemented right in the body of a method.
	// Lambda expression provides implementation of functional interface
	public static void main(String[] args) {
		// Lambda Expression with No Parameters
		Dem d = () -> System.out.println("showing..");
		d.show();
		// Lambda Expression with One Parameter
		Demo1 d1 = (int a) -> a;
		int result = d1.print(2);
		System.out.println(result);
		// Lambda Expression with Multiple Parameters
		Demo2 d2 = (a, b) -> a + b;
		int result1 = d2.add(4, 3);
		System.out.println(result1);
		//
		Demo4 d3 = new Demo4();
		d3.show3();
		d3.show1();
		int sub = d3.sub(7, 3);
		int multiply = Demo3.multiply(2, 3);// static method can only access by using ClassName
		System.out.println(sub);
		System.out.println(multiply);
	}
}

@FunctionalInterface
interface Dem {
	void show();
}

@FunctionalInterface
interface Demo1 {
	public int print(int a);
}

@FunctionalInterface
interface Demo2 {
	public int add(int a, int b);
}

interface Demo3 {
	// Interface is also similar to calss , it has only abstract methods except default and static methods
	// method bodies exists only for default and static methods
	default void show1() {
		System.out.println("show1 ... ");
	}

	default int sub(int a, int b) {
		return a - b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}
	// public int div(int a , int b) {//Abstract methods do not specify a body
	// return a/b;
	// }
}

class Demo4 implements Demo3 {
	void show3() {
		System.out.println("showing3 ... ");

	}
}
