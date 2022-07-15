package N_JavaQuestions;

import java.util.Scanner;

public class FactorialNumber {
	
	public static void main(String[] args) {
		
		//!5 = 5*4*3*2*1 = 120
		//!4 = 24
		//!0 = 1 --->factorial of 0 is 1
		int i;
		int factorial = 1;
		int number;
		System.out.println("Enter the number :");
		try (Scanner sc = new Scanner(System.in)) {
			number = sc.nextInt();
		}
		for(i = 1;i <=number ; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " +number+ " is :" +factorial);
	}

}
