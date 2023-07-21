package strings;

public class ReplaceFirstMethod {

	public static void main(String[] args) {
		
		String str = "AAAAA";
		System.out.println("Before Replacing..."+str);
		
		String replace_first = str.replaceFirst("A", "Q");
		System.out.println("After Replacing..."+replace_first);

	}

}
