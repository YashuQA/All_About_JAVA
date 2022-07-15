package N_JavaQuestions;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		//1234--4
		//123--3
		
		int num;
		int count = 0;
		System.out.println("Enter the number :");
		try(Scanner sc = new Scanner(System.in)){
			num = sc.nextInt();
		}
		while(num!= 0) {
			num = num/10;
			count++;
		}
		System.out.println("Number of digits :"+count);
		

	}

}
