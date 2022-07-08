package N_JavaQuestions;

public class swapingNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swaping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		System.out.println("After Swaping");
		
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		//without temp variable
		
		System.out.println("Before Swaping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		System.out.println("After Swaping");
		
		a = a-b; //-10
		b = a+b; // 10
		a = b-a; //20
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
