package Loops;

public class ForLoop {
    public static void main(String[] args) {
        // When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop
		//A for loop is more structured than the while loop
		//Using for: % Time elapsed: 0.0010001659 seconds. Using while: % Time elapsed: 0.026000023 seconds
        for(int i=2;i <= 4; i++){
            System.out.println("Helllo " + i);
           
        }

        for(int i=1;i<=5;i++){
            System.out.println("day " +i);

            for(int j=9;j<=17;j++){
                System.out.println(j +" - "+(j+1));

            }

        }
    }
}
