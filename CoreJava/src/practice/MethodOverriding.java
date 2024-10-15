package practice;
public class MethodOverriding {
    public static void main(String[] args) {
        AdvCalc ac = new AdvCalc();
        int r1 = ac.add(4,3);
        System.out.println(r1);

    }
}

class Calc{

    public int add(int n1, int n2){
        return n1+n2;
    }
}
class AdvCalc extends Calc{
    //If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java
    //Rules for Java Method Overriding
    //1.The method must have the same name as in the parent class
    //2.The method must have the same parameter as in the parent class
    //3.There must be an IS-A relationship (inheritance)
    public int add(int n1, int n2){
        return n1+n2+1;
    }

}
