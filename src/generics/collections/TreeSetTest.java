package generics.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1);set.add(3);
		set.add(5);set.add(7);
		System.err.println(set);
		System.out.println("set.floor(3) : "+set.floor(3)+"\t// <= 3");
		System.out.println("set.lower(3) : "+set.lower(3)+"\t// < 3");
		System.out.println("set.ceiling(3) : "+set.ceiling(3));
		System.out.println("set.floor(2) : "+set.floor(2));
		System.out.println("set.ceiling(3) : "+set.ceiling(3)+"\t// => 3");
		System.out.println("set.higher(3) : "+set.higher(3)+"\t//  > 3");
		System.out.println("-------- Sub Set --------");
		System.out.println("set.headSet(5) : "+set.headSet(5)+"    //toElement not included");
		System.out.println("set.tailSet(5) : "+set.tailSet(5)+"    //fromElement included");
		System.err.println("set.subSet(2, 5) : "+set.subSet(2, 5));
		
		Set sett = new TreeSet();
		sett.add(0);
		sett.add("azda");
//		Iterator it = sett.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
	}
}
