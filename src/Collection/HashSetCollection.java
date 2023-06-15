package Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {
	/*
	 *Predefined class in collections framework
	 *HashSet Parent Interface is Set
	 *Objects are printed in random order
	 *No indexing in hashset so repeating is not allowed
	 *No for-loop ,only for-each will work as there is no indexing concept
	 *No get(index) method
	 */
	public static void main(String[] args) {
		
		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(67);
		hash.add(89);
		hash.add(7);
		hash.add(8);
		for(Integer i : hash) {
			System.out.println("HashSet....."+i);
		}
		
		//----------------Set as Interface-----------------
		
			Set<String> h = new HashSet<String>();
			h.add("My");
			h.add("name");
			h.add("is");
			h.add("Yashu");
			for(String s :  h) {
				System.out.println("Set as Interface..."+s);
			}
			
		//----------------Set as Interface-----------------
			
				Collection<String> c = new HashSet<String>();
				c.add("My");
				c.add("name");
				c.add("is");
				c.add("Yashu");
				for(String ci :  c) {
					System.out.println("Collection as Interface..."+ci);
				}
	}

}
