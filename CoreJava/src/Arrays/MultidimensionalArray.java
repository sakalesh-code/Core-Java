package Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] num = {{1,2,3},{1,2,3,4}};
        System.out.println(num[1][3]);
        num[1][3] = 9;
        System.out.println("after changing :: "+num[1][3]);

        //Looping through an M-array
        for(int i=1;i<num.length;i++){ 

            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j] + " ");

            }
            System.out.println("//");
        }
        for(int row[] : num){
            for (int j : row ){

                System.out.print(j +"  ");
            }
            System.out.println("'");
        }

        //Using random numbers with for loop
        int no[][] =new int[3][4];
        for (int i =0;i<3;i++){
           // System.out.println(i);
            for (int j=0;j<4;j++){
                no[i][j] =(int)(Math.random() * 100);
                System.out.print(no[i][j]+ " ");
            }
            System.out.println("//");
        }
        //using random numbers with for-each
        for(int i[] : no){
            for( int j : i){
                //no[i][j] =(int)(Math.random() * 100);
                System.out.print(j+ " ");
            }
            System.out.println();

        }



    }
}
