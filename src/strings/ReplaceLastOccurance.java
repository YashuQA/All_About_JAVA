package strings;

public class ReplaceLastOccurance {

	public static void main(String[] args) {

	       // Initialized a String variable
        String str = "Tony Stark John Jon StarkTony";
         
        /*
         *  '$' means the last element of the matching pattern.
         *   So we have replaced the last occurrence of "Tony" with 
         *   "Trevor" using regex = "Tony$" 
         */
        String replaceAll = str.replaceAll("Tony$", "Trevor");
 
        // Printed the original element
        System.out.println(str);
 
        // Printed the replaced element
        System.out.println(replaceAll);

	}

}
