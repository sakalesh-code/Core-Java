package NestedClasses;

public class AnonymousinnerClass {
    public static void main(String[] args) {
       // Outer outer = new Inner();
       //An inner class declared without a class name is known as an anonymous inner class. 
       //In case of anonymous inner classes, we declare and instantiate them at the same time. 
       //Generally, they are used whenever you need to override the method of a class or an interface
        Oute outer = new Oute(){
            void show (){
                System.out.println("in Inner show ");
            }
        };
        outer.show();
        
    }
}

class Oute {
    void show (){
        System.out.println("in Outer show ");
    }
}
// class Inner extends Outer {
//     void show (){
//         System.out.println("in Inner show ");
//     }
// }
