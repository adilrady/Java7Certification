package generics.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {
	public static void main(String[] args) {
		NavigableMap<Integer, String> examScores = new TreeMap<Integer, String>();
		examScores.put(90, "AAAA");
		examScores.put(20, "BBBB");
		examScores.put(10, "CCCC");
		examScores.put(50, "DDDD");
		System.out.println("The data in the map is: " + examScores);
		System.out.println("The data descending order is: "
				+ examScores.descendingMap());
		System.out.println("Details of those who passed the exam: "
				+ examScores.tailMap(40));
		System.out.println("The lowest mark is: " + examScores.firstEntry());
	}
}