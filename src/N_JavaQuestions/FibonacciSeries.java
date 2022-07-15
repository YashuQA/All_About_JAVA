package N_JavaQuestions;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		//0,1,2,3,5,8,13,21,34....
		int number;
		int t1=0;
		int t2=1;

		
		System.out.println("Enter how many series you want :");
		try(Scanner sc = new Scanner(System.in)){
			number = sc.nextInt();
		}
		
		for(int i = 1;i<=number;i++) {
			System.out.println(t1); //0
			int sum = t1+t2; //0+1 =1
			t1=t2; //t1 = 1
			t2 =sum;//1
		}
		
		
	}

}
