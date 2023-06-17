package Arrays;

public class FrequencyOfEachElement {

	public static void main(String[] args) {
		
		//initilize array
		int[] array = new int[] {1, 2, 8, 3, 2, 2, 2, 5, 1};
		//Array freq will store frequencies of elements
		int[] freq = new int[array.length];
		
		int visited = -1;
		
		for(int i =0;i<array.length;i++){
			
			int count = 1;
			
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
					//To avoid counting same element again
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited) {
				freq[i]=count;
			}
		}
			//Display the frequency of each element present in array
			System.out.println("-----------------------------------");
			System.out.println("Element|Frequency");
			System.out.println("-----------------------------------");
			
			for(int i=0;i<freq.length;i++) {
				if(freq[i]!=visited) {
					System.out.println(" "+array[i]+" | "+freq[i]);
				}
			}
			System.out.println("-----------------------------------");
		}

	}


