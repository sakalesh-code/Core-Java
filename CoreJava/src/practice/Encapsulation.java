// Encapsulation in Java refers to Binding data (variables) and code (methods) into a single unit
package practice;

public class Encapsulation {
    public static void main(String[] args) {
       Student st = new Student();
       Student st1 = new Student(2);
       Student st2 = new Student(5,"sakalesh");
       st.setRollNo(1, st); 
       //st.setRollNo(1); 
      // Student.setName ("sakal");

      System.out.println(st.getRollNo() + " : "+Student.getName());
      System.out.println(st1.getRollNo() + " : "+Student.getName());
      System.out.println(st2.getRollNo() + " : "+Student.getName());
    }
}
class Student {
    //encapsulation is achieved by declaring the instance variables of a class as private,
    //which means they can only be accessed within the class
    private int rollNo;
    private static String name;
    ///Provide public getter and setter methods to allow other classes to access and modify the private instance variables
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo,Student st) {
        st.rollNo = rollNo;// this key word refers to the current object in a method or constructor
    }
    // public void setRollNo(int rollNo) {
    //     this.rollNo = rollNo;// this key word refers to the current object in a method or constructor
    // }
    public static String getName() {
        return name;
    }
    public static void setName(String name) {
        Student.name = name;
    }

    //default constructor
    //If no constructors are defined in the class, Java provides a default constructor with no parameters that initializes the object with default values.
    public Student () { //The constructor is called when an object of a class is created
        System.out.println("constructor");
        rollNo = 3;
        name = "sak";
    }
    //Parameterized constructor
    //You can define constructors with parameters to initialize objects with specific values.
    public Student(int rNo){
        System.out.println("constructor2");
        rollNo = rNo;
    }
    public Student(int rNo,String nm){
        System.out.println("constructor3");
        rollNo = rNo;
        name = nm;
    }

}


