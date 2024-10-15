package Arrays;

public class Array {
    
    public static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println(num[0]);
        num[0] = 7;
        System.out.println("after changing ::: "+num[0]);

        // Looping through an array
        for (int i=0;i< num[2];i++){
            System.out.println("1 :: num [" +i +"] = "+num[i]);
        }
        //By using length
        for (int i=0;i< num.length;i++){
            System.out.println("2 :: num [" +i +"] = "+num[i]);
        }
        //By using for-each
        for (int i : num){
            System.out.println("3 :: num [" +i +"] = "+i);
        }
    }
}
