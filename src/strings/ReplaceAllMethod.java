package strings;

public class ReplaceAllMethod {
	/*Replacing all the whitespaces between 
      characters with the '%'*/
	public static void main(String[] args) {

		String str = "This is Java Practice!";
		String replacing_All = str.replaceAll("\\s+", "%");
		
		System.out.println("Before Replacing..."+str);
		System.out.println("After Replacing..."+ replacing_All);

	}

}
