package practice;
public class enumDemo {
	// An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
	public static void main(String[] args) {
		System.out.println(" ::::: " + Days.MONDAY);
		Days d[] = Days.values();
		System.out.println(" ::::: " + d);
		// using enhanced lopp (for - each)
		for (Days days : Days.values()) {
			System.out.println(days + " : " + days.ordinal());
		}
		// using for loop
		Days days = Days.SUNDAY;
		if (days == Days.MONDAY) {
			System.out.println("Monday ::: ");
		} else if (days == Days.TUESDAY) {
			System.out.println("Tuesday ::: ");
		} else if (days == Days.WEDNESDAY) {
			System.out.println("Wednesdayy ::: ");
		} else if (days == Days.THURSDAY) {
			System.out.println("Thursday ::: ");
		} else if (days == Days.FRIDAY) {
			System.out.println("Friday ::: ");
		} else if (days == Days.SATURDAY) {
			System.out.println("Saturday ::: ");
		} else {
			System.out.println("Sunday ::: ");
		}
		// using switch
		switch (days) {
		case MONDAY:
			System.out.println("::: Monday ::: ");
			break;
		case TUESDAY:
			System.out.println("::: Tuesday ::: ");
			break;
		case WEDNESDAY:
			System.out.println("::: Wednesdayy ::: ");
			break;
		case THURSDAY:
			System.out.println("::: Thursday ::: ");
			break;
		case FRIDAY:
			System.out.println(":::Friday ::: ");
			break;
		case SATURDAY:
			System.out.println("::: Saturday ::: ");
			break;
		default:
			System.out.println("::: Sunday ::: ");
			break;
		}
		System.out.println("");
		// Age enum
		Age a = Age.sakalesh;
		System.out.println(a + " : " + a.getAge());
		for (Age age : Age.values()) {
			System.out.println(age + " : " + age.getAge());
		}

	}
}

enum Days {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

}

enum Age {
	sakalesh(28), rakesh(26), sak;

	int age;

	private Age() {
		this.age = 25;
	}

	private Age(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}