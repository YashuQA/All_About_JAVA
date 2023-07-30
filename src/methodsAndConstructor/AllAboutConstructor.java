package methodsAndConstructor;

public class AllAboutConstructor {
	/*
	 * It constructs the value at the time of object creation.
	 * It is called when an object of class is created.
	 * At the time of calling constructor, memory for the 
	   object is allocated in the memory.
	 * used to initialize the object.
	 * Java compiler created the default 
	   constructor if your class doesn't 
	   have any constructor.
	 * Rule : Constructor name must be the same as its class name
	 * Rule : Must have no return type
	 * Rule : A Java constructor cannot be abstract, 
	 		  static, final, and synchronized.
	 * Types : Default or no arguments – Provides default values
	 * Types : Parameterized constructor
	 * Constructor Overloading: having more than one constructor 
	 							  with different parameter lists.
	 * */
	String sModel;
	String sColor;
	String sTransmission;
	int iGear;
	int iHighestSpeed;
    int iMake;
    int iTyres;
    int iDoors;
    boolean bLeftHandDrive;
    
    public AllAboutConstructor(String Model,int Make,boolean LeftHandDrive) {
    	sModel=Model;
    	iMake=Make;
    	bLeftHandDrive=LeftHandDrive;
    }
    //Method
    public void DisplayCharacterstics(){
    	System.out.println("Model of the Car: " +  sModel);
    	System.out.println("Number of gears in the Car: " +  iGear);
    	System.out.println("Max speed of the Car: " +  iHighestSpeed);
    	System.out.println("Color of the Car: " +  sColor);
    	System.out.println("Make of the Car: " +  iMake);
    	System.out.println("Transmission of the Car: " +  sTransmission);

    }
	public static void main(String[] args) {
		
		AllAboutConstructor Audi = new AllAboutConstructor("Audi001", 2023, true);
		
		Audi.iDoors = 4;
		Audi.iGear = 5;
		Audi.iHighestSpeed = 200;
		Audi.iTyres = 4;
		Audi.sColor = "Black";
		Audi.sTransmission = "Manual";
		
		Audi.DisplayCharacterstics();
	}

}
