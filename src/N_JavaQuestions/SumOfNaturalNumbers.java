package N_JavaQuestions;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {

      int num;
      
      System.out.println("Enter the value :");
      try(Scanner sc = new Scanner(System.in)){
    	  num = sc.nextInt();
      }
      int sum = 0;
      int sum1 = 0;
      
      for (int i =1 ; i <= num ;i++) {
    	  sum = sum +i;
      }
      System.out.println("Sum is :" +sum);
      
      System.out.println("--------------------");
      
      int k = 1;
      while(k<= num) {
    	  sum1 = sum1 + k;
    	  k++;
      }
      System.out.println("Sum is :"+sum);

	}

}
