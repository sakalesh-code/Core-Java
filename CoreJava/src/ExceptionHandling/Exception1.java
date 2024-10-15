package ExceptionHandling;


//Java Exception Handling is a mechanism to handle runtime errors 
//such as ClassNotFoundException, IOException, SQLException, RemoteException, etc
public class Exception1 {
	public static void main(String[] args) {
		int i = 2;
		int j = 0;
		int[] arr = new int[5];
		String str = null;
		String name = "1";
		try {
			j = 8 / i;
			int value = arr[4];
			System.out.println(value);
			System.out.println(str.length());

		} catch (ArithmeticException e) {
			System.out.println("something went wrong " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("something went wrong " + e);
		} catch (Exception e) {
			System.out.println("something went wrong " + e);
		}
		;

		System.out.println(j);
		System.out.println("bye");
	}
}

