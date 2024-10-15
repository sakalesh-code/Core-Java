package practice;
public class AbstractClass {
    public static void main(String[] args) {
        Animal d = new Animal();
        d.eat();
        d.sound();
    }
   
}
//abstract class is declared with the abstract keyword. It may have both abstract and non-abstract methods(methods with bodies). 
//An abstract is a Java modifier applicable for classes and methods in Java but not for Variables
abstract class Dog {
    //Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
    //Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
    abstract void sound();
}
class Animal extends Dog{
     void sound(){
        System.out.println("sound :::");
    }
     void eat(){
        System.out.println("eating :::");
    }
}
