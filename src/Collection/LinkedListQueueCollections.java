package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueCollections {
	/*
	 * Queue is a data structure of java collections framework
	 * Used to store date in FIFO (First-In-First-Out)
	 * First element added to queue will be removed first */
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Yashu");
		queue.add("Pinky");
		queue.add("Cerelac");
		
		System.out.println(queue);
		
		String element = queue.remove();
		
		System.out.println(element);
		
		System.out.println(queue);

	}

}
