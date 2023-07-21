package strings;

public class SubStringMethod {
	/*How to replace a character in a String in 
	 Java without using the replace() method*/
	public static void main(String[] args) {

		String str = "This";
		System.out.println("Original String :"+str);
		String replaced = str.substring(0,2)+'u'+str.substring(2+1);
		System.out.println("Replaced String :"+replaced);

	}

}
