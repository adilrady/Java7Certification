package generics.collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class DequeTest {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addAll(Arrays.asList(10, 2, 3, 4, 5));
		for(Integer i:deque){
			System.out.print(i+" ");
		}
		System.out.println("\nThe removed element is: " + deque.remove());
	}
}