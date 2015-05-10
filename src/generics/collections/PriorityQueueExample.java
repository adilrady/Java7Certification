package generics.collections;

import java.util.*;

public class PriorityQueueExample {
	static class PQsort implements Comparator<Integer> { // inverse sort
		public int compare(Integer one, Integer two) {
			return two - one; // unboxing
		}
	}

	public static void main(String[] args) {

		int[] ia = { 1, 5, 3, 7, 6, 9, 8 }; // unordered data
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(); // use natural order
		
		for (int x : ia){				// load queue
			pq1.offer(x);
		}
		for (int x : ia) {
			System.out.print(pq1.poll() + " ");
		}
		System.out.println("");
		
		PQsort pqs = new PQsort();		//New instance of the inverse Comparator
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10, pqs);		//Use Comparator (Inverse)
		
		for(int x: ia){			//Load Queue
			pq2.offer(x);
		}
		System.out.println("Size: "+pq2.size());
		System.out.println("Peek: "+pq2.peek());
		System.out.println("Size: "+pq2.size());
		System.out.println("Poll: "+pq2.poll());
		System.out.println("Size: "+pq2.size());
		
		for (int i : ia) {							//Review Queue
			System.out.print(pq2.poll()+" ");
		}
	}
}
