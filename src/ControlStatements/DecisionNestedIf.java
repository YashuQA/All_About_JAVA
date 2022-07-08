package ControlStatements;

public class DecisionNestedIf {

	public static void main(String[] args) {
		String address = "Hyderabad, India";
		
		if(address.endsWith("India")) {
			
			if(address.contains("Meerut")) {
				
				System.out.println("Your city is Meerut");
				
			}else if(address.contains("Nodia")) {
				
				System.out.println("Your city is Noida");
			}else {
				System.out.println(address.split(",")[0]);
			}
		}else {
			System.out.println("You are not living India");
		}

	}

}
