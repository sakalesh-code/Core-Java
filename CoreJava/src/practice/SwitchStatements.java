package practice;
public class SwitchStatements {
	public static void main(String[] args) {
		int day = 7;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Please Enter a valid day");
		}
		// NestedSwitchExample.java
		// C - CSE, E - ECE, M - Mechanical
		char branch = 'C';
		int collegeYear = 4;
		switch (collegeYear) {
		case 1:
			System.out.println("English,Maths");
			break;
		case 2:
			switch(branch) {
			case 'A':
				System.out.println("Telugu");
				break;
			case 'B':
				System.out.println("English,Telugu");
				break;
			case 'C':
				System.out.println("Maths,telugu");
				break;
			case 'D':
				System.out.println("English,telugu");
				break;			
			}
			break;
		case 3:
			switch(branch) {
			case 'A':
				System.out.println("Maths,Telugu");
				break;
			case 'B':
				System.out.println("English");
				break;
			case 'C':
				System.out.println("Maths");
				break;
			case 'D':
				System.out.println("Telugu");
				break;
			}
			break;
		case 4:
			switch(branch) {
			case 'A':
				System.out.println("English,Telugu");
				break;
			case 'B':
				System.out.println("Telugu");
				break;
			case 'C':
				System.out.println("Maths");
				break;
			case 'D':
				System.out.println("English");
				break;
			}
			break;
			default:
				System.out.println("English,Maths,Telugu");
		}
	
	}
}
