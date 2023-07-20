package FlowControlStatements;

public class IFElseIFStatement {

	public static void main(String[] args) {
		
		int age = 3;
		
		if(age<4) {
			System.out.println("It is a Baby!");
		}else if(age>=4 && age<13) {
			System.out.println("He/She is a Child!");
		}else if(age>=13 && age<20) {
			System.out.println("He/She is a Teenager!");
		}else if(age>=20 && age<60) {
			System.out.println("He/She is an adult!");
		}else {
			System.out.println("He/she is an Elder Person!");
		}

	}

}
