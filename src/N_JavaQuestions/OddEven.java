package N_JavaQuestions;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Please enter the number :");
			
			int x = reader.nextInt();
			
			if(x % 2 ==0) {
				System.out.println(x +" is Even");
			}else {
				System.out.println(x +" is Odd");
			}
		}
	}

}
