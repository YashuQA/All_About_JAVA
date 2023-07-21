package strings;

public class Replacing {
	/*Replacing a String that starts with a character 
	  sequence with a new String.*/
	public static void main(String[] args) {
		
		/*Here, we are going to replace a String that 
		  starts with a certain character sequence with 
		  a new String. We have used the same input String 
		  (as an above scenario), then we have carried out 
		  the regex operation using replaceAll.*/
		  // Initialized a String
        String str = "Fred Freddy Franklin Michael Trevor Fredy";
 
        // Replacing the entire String that starts with Fred with the Ted
        String replaceAll = str.replaceAll("Fred.*", "Ted");
 
        // Printed the Original String
        System.out.println("Before ReplaceAll() " + str);
 
        // Printed the Final String after replaceAll() operation
        System.out.println("After ReplaceAll(): " + replaceAll);

	}

}
