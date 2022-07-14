package N_JavaQuestions;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
//		double can handle integers also
//		double number = 12.45;
//		double number = 0 ;
		double number;
		System.out.println("Enter the number :");
		try (Scanner sc = new Scanner(System.in)) {
			number = sc.nextInt();
		}
//		double number = -9;
			
			if(number < 0.0) {
				System.out.println(number + " is negative number.");
			}
			else if(number > 0.0) {
				System.out.println(number + " is Positive number.");
			}
			else {
				System.out.println(number + "is Zero.");
			}
		

	}

}
