package NestedClasses;

public class StaticNestedClass {
    public static void main(String[] args) {
        Out.Nested_Demo inner = new Out.Nested_Demo();
        inner.my_method();
        
    }
}
class Out {
    static class Nested_Demo {
       public void my_method() {
          System.out.println("This is my nested class");
       }
    }
}
