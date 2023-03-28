package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListCollection {

	public static void main(String[] args) {
		/*
		 * Array List is a predefined class in Java.
		 * Main different between array and arrayList is 
		 * 		Arrays ---> Store group of values
		 * 		ArrayList ---> Store group of objects
		 * 		Arrays ---> Fixed in size
		 * 		ArrayLists ---> are Resizable
		 * Syntax: Class ArrayList<E> -->E stands for type of elements in the list.
		 * Inorder to use ArrayList we need to create an Object.
		 * Syntax : ArrayList<Integer> list = new ArrayList<Integer>();
		 * add(index,Element) is the method to add elements to the arraylist
		 * get(int,index) is the method to get any value from arrayList
		 * for-each loop can be used with ArrayList and Collections
		 * Objects will be printed in order
		 * We can use for-loop, for-each loop , Iterator and iterator()
		 * */
	
			//-------------------------- Normal Array---------------------------
						int[] a = new int[3];
						
						a[0]=9;
						a[1]=6;
						a[2]=8;
						
						for(int i=0;i<a.length;i++) {
							System.out.println("Arrays...."+a[i]); //prints 9 6 8
						}
			
			//------------------------ArrayLists (for loop)--------------------------------
			
						ArrayList<Integer> alist = new ArrayList<Integer>();
						
						alist.add(5); //stored at index 0 
						alist.add(7); //stored at index 1
						alist.add(8); //stored at index 2
						
						for(int i = 0;i<alist.size();i++) {
						System.out.println("Array List...."+alist.get(i));
						}
			
			//------------------------ArrayLists (for-each loop)-----------------------
						ArrayList<Integer> arrayList = new ArrayList<Integer>();
						
						arrayList.add(9);
						arrayList.add(10);
						arrayList.add(14);
						
						for(Integer e : arrayList) {
							System.out.println("for-each loop arrayList..."+e);
						}
			//-----------------------ArrayList- List Interface-----------------------------------
						List<Integer> listArrayList = new ArrayList<Integer>();
						listArrayList.add(10);
						listArrayList.add(18);
						
						for(Integer b : listArrayList) {
							System.out.println("List as Interface..."+b);
						}
			//----------------------ArrayList - Collection Interface------------------------------
						Collection<Integer> collectionArrayList = new ArrayList<Integer>();
						
						collectionArrayList.add(98);
						collectionArrayList.add(65);
						
						for(Integer c : collectionArrayList) {
							System.out.println("Collection as Interface..."+c);
						}
			//-----------------------ArrayList - String Object------------------------------------
						ArrayList<String> stringArrayList = new ArrayList<String>();
						stringArrayList.add("My");
						stringArrayList.add("Name");
						stringArrayList.add("is");
						stringArrayList.add("yashu");
						for(String s : stringArrayList) {
							System.out.println("String Object Array List...."+s);
						}
		}

	}

