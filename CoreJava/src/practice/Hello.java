package practice;
 public class Hello {
    public static void main (String args[]){
        int num1 = 7;
        int num2 = 5;
        int result = num1+num2;

        System.out.println("result ="+result);

        //integers
        byte bt = 127;
        short sh = 129;
        int num = 6;
        long lg = 34355;

        //Float
        float f=1.8f;
        double d=1.8;

        //character
        char c='k';

        //Boolean
        boolean b =true;

        System.out.println("byte b="+bt+
        ",shot sh="+sh+",int num="+num+",long l="+lg+
        ",float f="+f+",double d="+d+
        ",character c="+c+
        ",Boolean b="+b);

    //Literals
    int count = 987;  
    float floatVal = 4534.99f;  
    double cost = 19765.567;  
    int hexaVal = 0x7e4;  
    int binary = 0b11010;  
    char alpha = 'p';  
    String str = "Java";  
    boolean boolVal = true;  
    int octalVal = 067;  
    String stuName = null;  
    char ch1 = '\u0021';  
    char ch2 = 1456;  
    System.out.println(count);  
    System.out.println(floatVal);  
    System.out.println(cost);  
    System.out.println(hexaVal);  
    System.out.println(binary);  
    System.out.println(alpha);  
    System.out.println(str);  
    System.out.println(boolVal);  
    System.out.println(octalVal);  
    System.out.println(stuName);  
    System.out.println(ch1);  
    System.out.println("\t" +"backslash literal");  
    System.out.println(ch2);  
 
   //Type conversion and casting
   byte x = 127;
   int y = x;//conversion
   System.out.println(x);

   int i = 258;
   byte j = (byte) i;//casting(when byte range exceeds,it performers moduler(%) with byte range and gives reminder as output)
   System.out.println(j);

   float k = 7.7f;
   int l =(int) k;//casting 
   System.out.println(l);

   int z = 8;
   float v =z;//conversion
   System.out.println(v);

   byte g = 100;
   byte h = 11 ;
   int r = g*h;//Type pramotions
   System.out.println(r);


    }
}
