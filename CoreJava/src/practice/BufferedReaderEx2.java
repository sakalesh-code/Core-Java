package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderEx2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter a number");
//		BufferedReader bf;
//		try {
//			//InputStreamReader in = new InputStreamReader(System.in);
//			bf = new BufferedReader(new InputStreamReader(System.in));
//			int num = Integer.parseInt(bf.readLine());
//			System.out.println(num);
//		}
//		finally {
//			System.out.println("Bye");
//		};

		// Try with resources
		try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
			int num = Integer.parseInt(bf.readLine());
			System.out.println(num);
		} finally {
			System.out.println("Bye");
		};

		System.out.println("Bye ... ");
	}

}
