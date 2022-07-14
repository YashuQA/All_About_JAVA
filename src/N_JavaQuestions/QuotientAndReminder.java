package N_JavaQuestions;

import java.util.Scanner;

public class QuotientAndReminder {

	public static void main(String[] args) {
	
		int divident;
		int divisor;
		
		System.out.println("Enter the Divident and Divisor :");
		try(Scanner sc = new Scanner(System.in)){
			divident = sc.nextInt();
			divisor = sc.nextInt();
		}
		
		int quotient = divident/divisor;
		int reminder = divident%divisor;
		
		System.out.println(quotient);
		System.out.println(reminder);

	}

}
