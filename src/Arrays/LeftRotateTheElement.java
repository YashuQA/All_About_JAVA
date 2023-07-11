package Arrays;

public class LeftRotateTheElement {

	public static void main(String[] args) {
		//Initialize array
		int[] array = new int[] {1,2,3,4,5};
		//n determines the number of times an array should be rotated
		int n = 3;
		//Displays original array
		System.out.println("Original Array: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		//Rotate the given array by n times towards left
		for(int i=0;i<n;i++) {
			int j;
			//Stores the first element of the array
			int first = array[0];
			for(j=0;j<array.length;j++) {
				//Shifting element of array by one
				array[j]=array[j+1];
			}
			//First element will be added to the end
			array[j] = first;
		}
		System.out.println();
		//Displays resulting array after rotation
		System.out.println("Array after left rotate:");
		for(int i =0; i<array.length;i++) {
			System.out.println(array[i]+" ");
		}

	}

}
