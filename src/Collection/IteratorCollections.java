package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorCollections {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		alist.add(5);
		alist.add(8);
		alist.add(7);
		alist.add(9);
		
		//can i used for loop and for-each loop ? ---> Yes
		//we can also use Iterator and iterator()
		
		Iterator<Integer> itr = alist.iterator();
		
		while(itr.hasNext()) {
			System.out.println("using iterator on arrayList..."+itr.next()); // 5 8 7 9
		}
		
		HashSet<Integer> hset = new HashSet<Integer>();
		
		hset.add(9);
		hset.add(6);
		hset.add(7);
		
		Iterator<Integer> hitr = hset.iterator();
		
		while(hitr.hasNext()) {
			System.out.println("using iterator on hashSet..."+hitr.next()); // prints randomly 
		}

	}

}
