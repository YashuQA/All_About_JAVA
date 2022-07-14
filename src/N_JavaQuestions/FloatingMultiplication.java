package N_JavaQuestions;

import java.util.Scanner;

public class FloatingMultiplication {

	public static void main(String[] args) {
	
		float f1;
		float f2;
		
		System.out.println("Enter the values :");
		try(Scanner sc = new Scanner(System.in)){
			f1 = sc.nextFloat();
			f2 = sc.nextFloat();
		}
		
		System.out.println("Multiplication of two float numbers :"+ (f1*f2));

	}

}
