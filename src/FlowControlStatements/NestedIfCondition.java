package FlowControlStatements;

public class NestedIfCondition {

	public static void main(String[] args) {
		/*
		 * There could be infinite if conditions inside an if condition
		 * 
		 * 
		 * If the inner condition satisfies then only outer if will be 
		   executed. Along with if conditions we can write else
		   condition also.
		 */
		int a = 10, b =20, c=30;
		
		if(a==10) {
			if(b==20) {
				if(c==30) {
					System.out.println("Hey Hello...");
				}
			}
		}
		

	}

}
