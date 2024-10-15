package practice;
public class StaticVariable {
    public static void main(String[] args) {
        
        System.out.println(Studen.section);
        Studen st = new Studen();
        st.rollNo = 1;
        st.name = "sak";
        Studen.section = 1;
       
        Studen st1 = new Studen();
        st1.rollNo = 2;
        st1.name = "sakalesh";
        Studen.section = 2;

        st.show();
        st1.show1();//Non-static methods are called by only creating object
        Studen.show3();//static methods are called by using class name
        Studen.show4(st);//static methods accessing non static methods,By creating and using the object of that class
    }
    
    // public static void main(String[] args) throws ClassNotFoundException {
    //  Class.forName("Studen");// It will load the sysytem class loader 'i.e' Studen class
    // }
}
class Studen {

    int rollNo;
    String name;
    static int section;
    
     void show(){
        System.out.println(rollNo + " : "+name +" "+section);
     }
     void show1(){
        System.out.println(rollNo + " : "+name +" "+section);//They can access both static as well as non-static variables
     }
     static void show3(){
        //System.out.println(rollNo);//Cannot make a static reference to the non-static variable rollNo
        System.out.println(section);//These static methods can only access static variables
     }
     static void show4(Studen st){
        System.out.println(st.rollNo + " : "+st.name +" "+section);
        //These static methods can only access static variables
        //If you want to access non static variables,By creating and using the object of that class
     }
     
     //static blocks in Java are used to initialize static variables. They are executed only once when the class is loaded
     static {
        section = 3 ; 
        System.out.println("static block initialized");
     }
     static {
    	 System.out.println("2nd static block initialized");
    	 System.out.println(Studen.section);  	 
     }
}