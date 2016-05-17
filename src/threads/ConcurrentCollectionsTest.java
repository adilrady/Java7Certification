package threads;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentCollectionsTest {

	public static void main(String[] args) {
		Set<Integer> set = new CopyOnWriteArraySet<Integer>();
		set.add(new Integer(10));
		set.add(20);
		Iterator<Integer> it = set.iterator();
		set.add(30);
		set.add(new Integer(40));
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
