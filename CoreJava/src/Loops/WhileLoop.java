package Loops;

public class WhileLoop {
	public static void main(String[] args) {
		int i = 1;
        //The while loop loops through a block of code as long as a specified condition is true
		while (i <= 5) {
			System.out.println("Hello " + i);
			// Nested loop
			int j = 1;
			while (j <= 2) {
				System.out.println("Hi " + j);
				j++;
			}
			i++;
		}
        System.out.println("Bye");

	}
}
