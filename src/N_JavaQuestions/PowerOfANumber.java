package N_JavaQuestions;

public class PowerOfANumber {

	public static void main(String[] args) {
		int base =2;
		int exponent = 4;
		
		long result =1;
		
		/*
		 * while(exponent != 0) { result *= base; --exponent; }
		 */
		for(;exponent!=0;--exponent) {
			result = result*base;
		}
		System.out.println(result);

	}

}
