package NestedClasses;

public class AbstractAnonymousinnerClass {
    public static void main(String[] args) {
        //Outer outer = new Inner();
        Outer outer = new Outer(){
            public void show(){
                System.out.println("in Inner show");
            }
            public void config(){
                System.out.println("in Inner config");
            }
        };
        outer.show();
        outer.config();

    }
}
abstract class Outer {
    abstract void show();
    abstract void config();
}
// class Inner extends Outer{
//     public void show(){
//         System.out.println("in Inner show");
//     }
// }
