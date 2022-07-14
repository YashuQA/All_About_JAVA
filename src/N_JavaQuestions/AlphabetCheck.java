package N_JavaQuestions;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
		
//		char c = '$';
//		char c = 'a';
//		char c = 'A';
		
		char c;
		
		System.out.println("Enter the character :");
		try(Scanner sc = new Scanner(System.in)){
		c = (char) sc.next().charAt(0)	;
		}
		
		if((c >= 'a' && c <= 'z')||(c >= 'A' && c <='Z')) {
			
			System.out.println(c + " is an Alphabet.");
			
		}else {
			
			System.out.println(c + " is not an Alphabet.");
		}

	}

}
