package N_JavaQuestions;

import java.util.Scanner;

public class greatestNumber {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		
		System.out.println("Enter the values of x,y and z :");
		try(Scanner sc = new Scanner(System.in)){
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
		}
		if(x>y && x>z) {
			System.out.println("x is greatest number");
		}else if(y>z) {
			System.out.println("y is greatest number");
		}else {
			System.out.println("z is greatest number");
		}

		if(x>=y) {
			if(x>=z) {
				System.out.println("x is greatest number");
			}else{
				System.out.println("z is greatest number");
			}
		}else {
			if(y>=z) {
				System.out.println("y is greatest number");
			}else {
				System.out.println("z is greatest number");
			}
		}
	}

}
