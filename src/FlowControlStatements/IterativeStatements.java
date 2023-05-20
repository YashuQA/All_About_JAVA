package FlowControlStatements;

public class IterativeStatements {

	public static void main(String[] args) {

//		for(int i=0;i<15;i++) {
//			System.out.println("This is line is going to print 15 times.");
//		}
		
		//----------Example of an Infinite-loop-while-------
		/*
		  int a =5, b=4;
		  while(a>b){
		  system.out.println("Inside while loop a is greater the b");
		  }
		*/
		int i =0;
		while(i<5) {
			System.out.println("Inside while loop - i is:"+i);
			i++; //This will increment the value of i by 1 
		}
		
		for(int a=0;a<5;a++) {
			System.out.println("Inside for loop");
		}

	}

}
