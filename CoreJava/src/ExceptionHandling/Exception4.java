package ExceptionHandling;

public class Exception4 {
	public static void main(String[] args) {
		ThrowException te = new ThrowException();
		try {
			te.show();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

class ThrowException {
	static {
		System.out.println("hey");
	}
	public void show() throws ClassNotFoundException {
		Class.forName("Demo");
	}
}