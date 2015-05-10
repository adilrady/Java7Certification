package generics.collections;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add(1, "Summer"); //IndexOutOfBoundsException, Can't start insertion from 1, only from 0 
		arrayList.add(2, "Autumn");
		
	}
}
