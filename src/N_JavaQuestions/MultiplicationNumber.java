package N_JavaQuestions;

import java.util.Scanner;

public class MultiplicationNumber {

	public static void main(String[] args) {
		int number;
       System.out.println("Enter the number :");
       try(Scanner sc = new Scanner(System.in)){
    	  number = sc.nextInt();
       }
       
       for(int i = 1;i<=10;i++) {
    	   System.out.println(number +" x "+ i +" = " +(number*i));
       }

	}

}
