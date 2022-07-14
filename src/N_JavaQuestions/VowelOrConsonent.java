package N_JavaQuestions;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		
		char ch;
		
		System.out.println("Enter the Character :");
		try(Scanner sc = new Scanner(System.in)){
			ch = sc.next().charAt(0);
		}
		
		if(ch =='a' ||ch == 'e'|| ch =='i' ||ch == 'o'||ch =='u') {
			System.out.println(ch + " is Vowel");
		}else {
			System.out.println(ch + " is consonent");
		}
		//or switch case
		switch (ch) {
		case 'a': 
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		{
		System.out.println(ch +" is a Vowel");
		break;
		}
		default:
			System.out.println(ch +" is a Consonent");
		}

	}

}
