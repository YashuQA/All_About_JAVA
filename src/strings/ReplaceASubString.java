package strings;

public class ReplaceASubString {

	public static void main(String[] args) {

		String str = "Fred Freddy Franklin Michael Trevor Fredy";
		System.out.println("Original String :"+str);
		String replaced = str.replaceAll("Fred", "Ted");
		System.out.println("Replaced :"+replaced);

	}

}
