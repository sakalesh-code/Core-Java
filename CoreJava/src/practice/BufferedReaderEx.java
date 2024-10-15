package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Java BufferedReader class is used to read the text from a character-based input stream. 
//It can be used to read data line by line by readLine() method. 
//It makes the performance fast. It inherits Reader class.

public class BufferedReaderEx {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a number");
		// int num = System.in.read();
		// System.out.println(num);// printing ASCII values

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
		int num = Integer.parseInt(bf.readLine());
		System.out.println(num);
		bf.close();

//		Scanner s = new Scanner(System.in);
//		int num = s.nextInt();
//		System.out.println(num);

	}

}
