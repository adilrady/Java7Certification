package generics.collections;

public class ArrayManipulationExample {

	public static void main(String[] args) {
		int [] array1 = {1,2,3,4,5};
		int [] array2 = {0,0,0,0,0};
//		System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(array1, 2, array2, 2, 3);
		for (int i = 0; i < array2.length; i++) {
			System.out.print(" "+array2[i]);
		}
	}
}
