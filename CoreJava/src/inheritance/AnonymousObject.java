package inheritance;
public class AnonymousObject {
    public static void main(String[] args) {
        Dem d = new Dem();
        d.show();
        d.show();//you can re-use the same object here
        System.out.println();
        new NewDemo().play();//AnonymousObject
        new NewDemo().play();// you can't re-use the same object here
    }
}

class Dem {

    void show(){
        System.out.println("showing");
    }
    Dem(){
        System.out.println("Object created");
    }
}

class NewDemo{
    void play(){
        System.out.println("Playing..");
    }
    NewDemo(){

        System.out.println("ND object created");
    }
}
