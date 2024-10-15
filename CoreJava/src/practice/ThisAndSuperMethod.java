package practice;
public class ThisAndSuperMethod {
    public static void main(String[] args) {
        B b =new B(5);
    }
}

class A{

    public A(){
        super();
        System.out.println("in A");
    }
    public A(int a){
        super();
        System.out.println("in int A");
    }
}

class B extends A{

    public B(){
        super();//super() calls the parent constructor
        System.out.println("in B");
    }
    public B(int a){
        //super(5);
        this();//this() can be used to invoke the current class constructor
        System.out.println("in int B");
    }
}
