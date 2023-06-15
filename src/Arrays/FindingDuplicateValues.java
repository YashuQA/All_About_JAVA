package Arrays;

import java.util.HashSet;

public class FindingDuplicateValues {

	public static void main(String[] args) {
		
			int[] a = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
	        System.out.println("Duplicate Values: ");

	        for(int i=0;i<a.length;i++){
	            for(int j=i+1;j<a.length;j++){
	                if(a[i]==a[j]){
	                    System.out.println(a[j]);
	                }
	            }
	        }
	        
	        int[] b = new int[] {9,8,8,7,5,4,3,1,9};
	        System.out.println("Duplicate Value using HashSet: ");
	        //No indexing in hashset so repeating is not allowed
	        HashSet<Integer> set = new HashSet<Integer>();
	        
	        for(int element :b) {
	        	
	        	if(!set.add(element)) {
	        		System.out.println("Duplicate Element :"+element);
	        	}
	        }
	    }

	}


