package N_JavaQuestions;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		/*
		 * Leap Year
		 * Divisible by 4 
		 * century year --ending with 00
		 * but 1900 is not a leap year and 2012 is a leap year
		*/
		int year;
		System.out.println("Enter the year :");
		try(Scanner sc = new Scanner(System.in)){
			
			year = sc.nextInt();
		}
		boolean leap = false;
		if(year % 4 ==0) {
			if(year % 100 ==0) {
				if(year % 400 ==0) {
					leap = true;
				}else {
					leap = false;
				}
			}
			else {
				leap = true;
			}
			}

		else {
			leap = false;
		}
		if(leap) {
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year + " is not a leap year");
		}
		
	}

}
