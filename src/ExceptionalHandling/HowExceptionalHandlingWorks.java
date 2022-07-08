package ExceptionalHandling;
//
//public class HowExceptionalHandlingWorks  {
//
//	public static void main(String[] args) {
//		
//		int data = 50/0; //may throw an error
//		System.out.println("Rest of the Code!");
//		System.out.println(data);
//	}
//}
//
///**
// * Out put
// * Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at JavaPracticeSession/ExceptionalHandling.WithoutExceptionalHandling.main(WithoutExceptionalHandling.java:7)
//	
//	The Rest of the Code is not executed.
// */
 
//--------------------Solution by exceptional Handling-----------------------------------------------------------------

public class HowExceptionalHandlingWorks {  
  
    public static void main(String[] args) {  
    	
        try  
        {  
        int data=50/0; //may throw exception   
        System.out.println(data);
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}  
/*
 * OutPut
	java.lang.ArithmeticException: / by zero
	rest of the code*/
 