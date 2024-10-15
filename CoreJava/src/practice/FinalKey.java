package practice;
public class FinalKey {
    public static void main(String[] args) {
        AdvCal ac = new AdvCal();
        ac.show();
    }
}
     class Cal{
   // final class Cal{
     void show (){
    //final void show (){
        System.out.println("by sak");
    }
    void add(int a,int b){

        System.out.println(a+b);
    }
}
class AdvCal extends Cal{
    //class AdvCal extends Cal class{// can't extends when declared as final (variable,method,class)
 void show (){
    System.out.println("by saklesh");
 }
}
