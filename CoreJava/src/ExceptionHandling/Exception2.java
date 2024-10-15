package ExceptionHandling;

public class Exception2 {
	public static void main(String[] args) {
		int i = 9;
		int j = 0;
		try {
			j = 8 / i;
			if (j == 0) {
				// The Java throw keyword is used to throw an exception explicitly.
				// It is mainly used to throw a custom exception.
				throw new ArithmeticException("can't devide");
			}
		} catch (ArithmeticException e) {
			j = 18 / 1;
			System.out.println("thats the output " + e);
		}
		;

		System.out.println(j);
		System.out.println("bye");
	}

}
