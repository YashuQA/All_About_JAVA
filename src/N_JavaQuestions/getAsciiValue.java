package N_JavaQuestions;

import java.util.Scanner;

public class getAsciiValue {

	public static void main(String[] args) {
		char c;
		System.out.println("Enter the Character :");
		
		try(Scanner sc = new Scanner(System.in)){
			c = sc.next().charAt(0);
		}
		
		int asciiValue = c;
		/* store value into integer or convert value into integer
		 * int asciiValue = (int)c */
		System.out.println("ASCII of "+c+" is "+asciiValue);
	}

}
