package N_JavaQuestions;

public class greatestNumber {

	public static void main(String[] args) {
		int x = 30;
		int y = 40;
		int z = 19;
		
		if(x>y && x>z) {
			System.out.println("x is greatest number");
		}else if(y>z) {
			System.out.println("y is greatest number");
		}else {
			System.out.println("z is greatest number");
		}

		if(x>=y) {
			if(x>=z) {
				System.out.println("x is greatest number");
			}else{
				System.out.println("z is greatest number");
			}
		}else {
			if(y>=z) {
				System.out.println("y is greatest number");
			}else {
				System.out.println("z is greatest number");
			}
		}
	}

}
