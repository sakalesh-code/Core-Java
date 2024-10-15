package Loops;
//
public class DoWhileLoop {
    public static void main(String[] args) {
        int  i = 5;
        //This loop will execute the code block once, 
        //before checking if the condition is true, then it will repeat the loop as long as the condition is true
        do{
            System.out.println("Hello "+ i);
            i++;
        }while(i <=4);
        
    }
}
