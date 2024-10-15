package NestedClasses;

public class InnerClass {
    public static void main(String[] args) {
        Outer_Demo od = new Outer_Demo();
        od.display_Inner();
    }
}
//Creating an inner class is quite simple. You just need to write a class within a class. 
//Unlike a class, an inner class can be private and once you declare an inner class private, 
//it cannot be accessed from an object outside the class.
class Outer_Demo{

    private class Inner_Demo {
        public void print() {
           System.out.println("This is an inner class");
        }
     }
      // Accessing he inner class from the method within
    void display_Inner() {
    Inner_Demo inner = new Inner_Demo();
    inner.print();
 }
 
}

