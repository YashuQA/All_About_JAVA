package Collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {
	/*
	 * TreeSet - Predefined class in Java
	 * Store collections of unique elements in a set that is stored in ascending order
	 * Red-Black tree based implementation
	 * Uses tree to store the elements and doesn't allow duplicate element
	 * Provides fast insertion, deletion and lookup*/
	public static void main(String[] args) {
		
		Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("Yashu");
		treeSet.add("Pinky");
		treeSet.add("Cerelac");
		treeSet.add("Pinky"); //Duplicate Data
		
		System.out.println("Tree Set :"+treeSet);
		
		treeSet.remove("Cerelac");
		
		System.out.println("Tree Set :"+treeSet);
	}

}
