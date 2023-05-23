package Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int a[] = new int[5]; //Declaring and Creating
		
		//Assigning
		a[0]=9;
		a[1]=4;
		a[2]=3;
		a[3]=6;
		a[4]=7;
		
		//Accessing
		for(int i=0;i<5;i++) {
		System.out.print(a[i]);
		}
		
		String b[] = new String[3];
		
		b[0]="Shiva";
		b[1]="Ram";
		b[2]="Krishna";
		
		for(int j=0;j<3;j++) {
			System.out.print(b[j]);
		}

		//Shortcut way - Declaring, Creating and Assigning 
		int[] c = {4,9,2};
		
		for(int k=0;k<3;k++) {
			System.out.print(c[k]);
		}
		
		String[] d = {"Vishnu","Eswara","Parashurama"};
		
		for(int l=0;l<3;l++) {
			System.out.print(d[l]);
		}
		
		/*
		 *To find the length of an array - we have a 
		  predefined/inbuilt variable called length */ 
		
		int[] arrayOne = {7,9,3,4,2,7,3,7,9};
		System.out.println("Size of the array is :"+arrayOne.length);
		
		for(int g=0;g<arrayOne.length;g++) {
			System.out.println(g+" element in the array is :"+arrayOne[g]);
		}
		
		//for-each loop for arrays
		
		for(int h:arrayOne) {
			
			System.out.println(h);
		}
	}

}
