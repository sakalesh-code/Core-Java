package NestedClasses;

public class InnerClass2 {
    public static void main(String[] args) {
        Outer_Dem od = new  Outer_Dem();
        Outer_Dem.Inner_Demo id = od.new Inner_Demo();
        System.out.println(id.getNum()); 
        
    }
}

class Outer_Dem{
    private int num = 175;  
    public class Inner_Demo{
        int getNum(){
            return num;
        }
    }
}
