package Arrays;

public class ArrayObjectExampl {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.rollNo = 20;
		s1.name = "sak";
		s1.marks = 77;

		Student s2 = new Student();
		s2.rollNo = 30;
		s2.name = "sakal";
		s2.marks = 88;

		Student s3 = new Student();
		s3.rollNo = 40;
		s3.name = "sakalesh";
		s3.marks = 99;

		Student students[] = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;

		for (int i = 0; i < students.length; i++) {
			System.out.println((students[i].rollNo + " : " + students[i].name + " " + students[i].marks));

		}
		//Enhanced loop or for-each loop
		for (Student stud : students){
			System.out.println(stud.rollNo +" : "+stud.name+" "+stud.marks);
		}
	}
}

class Student {
	int rollNo;
	String name;
	int marks;
}