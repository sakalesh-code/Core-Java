package NestedClasses;

public class MethodLocalInnerClass {
    public static void main(String[] args) {
        outer_De outer = new outer_De();
        outer.display();
        
    }
}
class outer_De {
    // Method-local Inner Class - we can write a class within a method and this will be a local type
    void display(){
        int num = 23;
        class Inner_Demo {
            public void print() {
                System.out.println(+num);	   
             } 
            }
             Inner_Demo inner = new Inner_Demo();
             inner.print();
    }
}
