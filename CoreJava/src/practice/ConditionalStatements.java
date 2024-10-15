package practice;
public class ConditionalStatements {
    public static void main(String[] args) {
       
		int a = 16;
		int b = 17;
		int c = 20;
		//A programming language uses control statements to control the flow of execution of a program based on certain conditions
		// if-else
		if (a > b) {
			System.out.println("a = " + a);
			System.out.println("Thank you");
		} else
			// {
			System.out.println("b = " + b);
		// System.out.println("Thank you1");
		// System.out.println("welcome");
		// }

		// if-else-if
		if (a > b && a > c)
			System.out.println(a);
		else if (b > c) // removed (b>a &&) for code efficiency
			System.out.println(b);
		else
			System.out.println(c);
		int value = (a > b && a > c) ? a : ((b > c) ? b : c);// Using Ternary Operator
		System.out.println("value is :::" + value);
		// Before using Ternary Operator
		int result = 0;
		if (a % 2 == 0)
			result = 10;
		else
			result = 7;

		System.out.println("result is :::" + result);

		// After using Ternary Operator
		int result1 = (a % 5 == 0) ? 10 : 7;
		System.out.println("result1 is :::" + result1);
    }
	
}
