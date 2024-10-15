package practice;

public class WrapperClass {
	public static void main(String[] args) {
		// The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive
		int i = 7;
		Integer in = i;// The automatic conversion of primitive into an object is known as autoboxing
		System.out.println("Integer value : " + in);

		i = in.intValue();// The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing.
		System.out.println("int value : " + i);

		// wrapper classes
		Integer myInt = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(myChar);

		// converting objects into primitive
		System.out.println(myInt.intValue());
		System.out.println(myDouble.doubleValue());
		System.out.println(myChar.charValue());

		// toString() method, which is used to convert wrapper objects to strings.
		Integer value = 100;
		System.out.println(value);
		String myString = value.toString();
		System.out.println(myString.length());

	}
}