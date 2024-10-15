package practice;
public class Polymorphism {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank = new Sbi();
        System.out.println("Sbi rate of interest : "+bank.getrateOfInterest());

        bank = new Axis();
        System.out.println("Axis rate of interest : "+bank.getrateOfInterest());
        
    }
}
//polymorphism means having many forms
//Runtime polymorphism or Dynamic Method Dispatch
class Bank{
    public int  getrateOfInterest(){
        return 0;
    }
}
class Sbi extends Bank{
    public int  getrateOfInterest(){
        return 7;
    }
}
class Axis extends Bank{
    public int  getrateOfInterest(){
        return 8;
    }
}
