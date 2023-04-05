package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollections {
/*
 * HashMap is a Predefined class in Java
 * Map is the Parent interface of HaspMap
 * Unlike ArrayList , HashMap takes two object arguments
 * Called as Key-Value pairs
 * Unlike ArrayList and HashSet--> add() , HashMap uses put() method to add elements
 * Here we use for-each loop , for iterating we using KeySet() method and to get value we use get(Key)*/
	public static void main(String[] args) {
		
		HashMap<Integer, String> hMap = new HashMap<Integer , String>();
		
		hMap.put(101, "Yashu");
		hMap.put(102, "Pinky");
		hMap.put(103, "Cerelac");
		
		String x = hMap.get(102);
		
		System.out.println(x);
	
		for(Integer i : hMap.keySet()) {
			System.out.println("HashMap..."+hMap.get(i));
		}
		
		Map<Integer, String> map =new HashMap<Integer,String>();
		
		map.put(1, "x");
		map.put(2, "y");
		map.put(3, "z");
		
		for(Integer a : map.keySet()) {
			System.out.println("Map as parent inteface for HashMap..."+map.get(a));
		}
		

	}

}
