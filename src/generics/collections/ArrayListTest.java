package generics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
//		IndexOutOfBoundsException, Can't start insertion from 1, only from 0
//		arrayList.add(1, "Summer");  
//		arrayList.add(2, "Autumn");
		
		List<Integer> intList = new ArrayList<>();//Arrays.asList(1,2,3);
//		Compiler Error: The method add(Integer) in the type List<Integer> is not applicable for the arguments (String)
//		intList.add("Hello");
		intList.addAll(Arrays.asList(1,2,3));

		intList.remove(0);	// => Throws UnsupportedOperationException in case of initializing "intList" with "Arrays.asList"
		for (Integer integer : intList) {
			System.out.println(integer);
		}
		
		arrayList.add("1");
		arrayList.add("2");
		arrayList.remove(1);
		System.out.println(arrayList);
		
	}
}
