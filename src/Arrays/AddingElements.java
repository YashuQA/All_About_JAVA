package Arrays;

public class AddingElements {

	public static void main(String[] args) {
		//Initilizing array
		int[] array1 = new int[]{1,2,3,4,5};
		//Creating array2 of size array one
		int[] array2 = new int[array1.length];
		//Copying all elements of one array into another
		for(int i =0; i<array1.length;i++) {
			array2[i] = array1[i];
		}
		//Displaying elements of array one
		for(int i=0;i<array1.length;i++) {
		System.out.println(array1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]+" ");
		}
	}

}
