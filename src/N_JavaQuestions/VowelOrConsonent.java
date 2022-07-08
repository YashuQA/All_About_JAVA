package N_JavaQuestions;

public class VowelOrConsonent {

	public static void main(String[] args) {
		
		char ch = 'e';
		
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
