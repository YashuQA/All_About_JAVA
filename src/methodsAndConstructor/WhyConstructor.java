package methodsAndConstructor;

public class WhyConstructor {
	/*
	 * Why do we need a Constructor?
	 * Situation : Where exposing the class variable 
	 			   to the main program is not secure.
	 * Solution: turning the class variables to "private" 
	 * Coz private variables are not accessiable outside the class
	 * In this situation , if the constructors are defined, then the main
	   main method would not need to access class variables directly 
	 * Another situation : few class variables are very important for the 
	 					   class object and the programmers wants to make 
	 					   sure that who so ever uses the class and create
	 					   the object of the class, does not forget to initilize
	 					   these important variables*/
	private String name;
	private int age;
	public WhyConstructor(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//Getter method to access the private fields 
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	 // Setter methods to modify the private fields
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
	public static void main(String[] args) {
		/*In this example, we have defined a Person class 
		  with two fields, name and age, and a constructor 
		  that takes two parameters name and age. 
		  The constructor sets the initial values of the 
		  fields for each object created.
		*/
	    // Create a new Person object using the constructor
        WhyConstructor person1 = new WhyConstructor("Alice", 30);

        // Create another Person object using the constructor
        WhyConstructor person2 = new WhyConstructor("Bob", 25);

        // Accessing the fields using getter methods
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");

        // Modifying the fields using setter methods
        person1.setName("Eve");
        person2.setAge(27);

        // Printing the modified values
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
    }
}
