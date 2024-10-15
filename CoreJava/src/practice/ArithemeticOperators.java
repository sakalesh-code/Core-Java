package practice;
public class ArithemeticOperators {

    public static void main(String[] args) {
         int num = 7;
         int num2 = 3;

        //int  result =num+num2;//addition
        //int  result =num-num2;//substraction
        //int  result =num*num2;//multiplication
        //int  result =num/num2;//division
        int  result =num%num2;//modulus
        System.out.println(result);
        //Operators for compound assingnments
        //num +=num2;//addition
        //num -=num2;//substraction
        //num *=num2;//multiplication
        //num /=num2;//division
        num %=num2;//modulus
        //Increment Operators
        int no=7;
        //no++;//Post - increment
        //++no;//Pre - increment
        //--no;
       // no--;
        //int value = no++;//fetch the value then increment
        //int value = ++no;//increment and then fetch the value
        //int value = no--;//fetch the value then decrement
        int value = --no;//decrement and then fetch the value
        System.out.println(value);
    }
}