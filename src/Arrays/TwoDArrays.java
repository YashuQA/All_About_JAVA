package Arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		/*
		 * int[][] x = new int[2][3];
		 * 
		 * x[0][0]=6; x[0][1]=3; x[0][2]=6; x[1][0]=4; x[1][1]=2; x[1][2]=1;
		 */
		
		int[][] x = {{6,3,6},{4,2,1}};  
		
		//Finding the no.of rows in TwoDArray
		System.out.println(x.length); // 2 rows
		
		//Finding the no.of Columns
		System.out.println(x[0].length);//3 columns
		
		for(int row=0;row<x.length;row++) {
			
			for(int col=0;col<x[0].length;col++) {
				System.out.println(x[row][col]);
			}
		}
		

	}

}
