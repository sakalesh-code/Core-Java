package practice;
public class MethodOverLoading {

	public int add(int num1, int num2) {

		return num1 + num2;
	}

	// MethodOverLoading - multiple methods with the same name but different parameters
	public int add(int num1, int num2, int num3) {

		return num1 + num2 + num3;
	}

	// public double add(int num1, double num2) {

	// 	return num1 + num2;
	// }

	public static void main(String[] args) {
		MethodOverLoading meth = new MethodOverLoading();
		int result = meth.add(7, 2);
		int result1 = meth.add(7, 2, 3);
		double result2 = meth.add(7, 2, 3);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);

	}
}
