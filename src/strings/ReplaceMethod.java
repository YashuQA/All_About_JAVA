package strings;

public class ReplaceMethod {

	public static void main(String[] args) {

		String original_string = "CAT";
		String replaced_string = original_string.replace('C','R');
		
		System.out.println("The original string :"+original_string);
		System.out.println("The replaced string :"+replaced_string);

		//Replacing Character Sequence
		
		String org_string = "Shooting";
		String replaced_seq = org_string.replace("oot", "out");
		
		System.out.println("The Original Sequence :"+org_string);
		System.out.println("The Replaced Sequence :"+replaced_seq);
	}

}
