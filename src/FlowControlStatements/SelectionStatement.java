package FlowControlStatements;

public class SelectionStatement {

	public static void main(String[] args) {
		//--------if------------
		int a = 5, b=3;
		if(a>b) {
			System.out.println("a is greater that b");
		}
		//----------if else---------
		int x=10,y=20;
		if(x>y) {
			System.out.println("Inside if block as x is greater that y");
		}else {
			System.out.println("Inside else block as y is greater that x");
		}
		//---------if..else if..else--------
		int h=6,j=5,k=4,l=3,m=2;
		if(h<j) {
			System.out.println("Inside If block");
		}else if(j<k) {
			System.out.println("Inside first else if block");
		}else if(k<l) {
			System.out.println("Inside second else if block");
		}else if(l<m) {
			System.out.println("Inside third else if block");
		}else {
			System.out.println("Inside else block");
		}
		
		//-------------switch---------------------
		int switchCondition=5;
		 
		switch(switchCondition) {
		
		case 0:
			System.out.println("Inside case 0");
			break;
		case 1:
			System.out.println("Inside case 1");
			break;
		case 2:
			System.out.println("Inside case 2");
			break;
			
	    default:
	    	System.out.println("Inside default...as no case is matching");
		}
		 
		

	}

}
