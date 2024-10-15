package practice;
public class TypeCasting {
    public static void main(String[] args) {
        double d = 7.4;
        System.out.println(d);
        //covert double  into int
        int i =(int) d;// Type casting - converting from one datatype to another datatype
        System.out.println(i);
        Child c = new Child();
        c.show();
        c.show1();
        System.out.println(" ");
        Parent p = new Parent();
        p.show();
        System.out.println(" ");
        Parent po = new Child();// Up casting - typecasting of a child object to parent object
        po.show();
        System.out.println(" ");
        // Trying to Downcasting Implicitly
        // Child c = new Parent(); - > compile time error
        // Downcasting Explicitly
        Child pc = (Child) po;// down casting - typecasting of a parent object to child object
        pc.show();
        pc.show1();
    }
}

class Parent{
    void show(){
        System.out.println("show Parent");
    }
}
class Child extends Parent{
    void show1(){
        System.out.println("show child");
    }
    
}
