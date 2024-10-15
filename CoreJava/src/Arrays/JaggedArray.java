package Arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int num[][] = new int[3][]; // Jagged /ragged/irregular arrays
		num[0] = new int[3];
		num[1] = new int[2];
		num[2] = new int[4];

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = (int) (Math.random() * 10);
				System.out.print(num[i][j] + " ");

			}
			System.out.println("/");
		} 
        System.out.println("");
		//3 Dimensional Array
		int no[][][] = new  int[2][3][4];
		
		for (int i=0;i<no.length;i++) {
			for(int j=0;j<no[i].length;j++) {
				for(int k=0;k<no[i][j].length;k++) {
					no[i][j][k] =(int) (Math.random() *10);
					System.out.print(no[i][j][k]+ " ");
				}
				System.out.println(".");
			}
			System.out.println("'");
		}
		

	}


}