package JavaTutorials;

public class JavaVariables {

	static int static_variable = 4;
	static void method() {
		int local_variable = 67;
		System.out.println(local_variable);
	}
	public static void main(String args[]) {
		int instance_variable = 90;
		System.out.println(instance_variable);
		method();
		System.out.println(static_variable);
	}	
}
