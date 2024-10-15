package practice;
public class LogicalOperators {
    public static void main(String[] args) {
		int a = 6;
		int b = 7;
		int c = 8;
		int d = 9;
		//boolean result = a<=b && c<=d;
		boolean result = !(a<=b) || c>=d;
		System.out.println(!result);
	}
}
