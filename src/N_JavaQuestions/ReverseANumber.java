package N_JavaQuestions;

import java.util.Scanner;
public class ReverseANumber {

	public static void main(String[] args) {
		
		int num; //4321
		System.out.println("Enter the number need to be reversed :");
		try(Scanner sc = new Scanner(System.in)){
			num = sc.nextInt();
		}
		int rev = 0;
		
		while(num != 0) {
			int n = num % 10; //4
			rev = rev*10+n; //4
			num = num/10;
		}
       System.out.println("Reversed Number :"+rev);
	}

}
