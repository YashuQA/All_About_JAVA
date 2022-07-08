package N_JavaQuestions;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {
		
		try (Scanner read = new Scanner(System.in)) {
			System.out.println("Enter the value :");
			int num = read.nextInt();
			System.out.println("Number you entered is  "+num);
		}
	}
}
