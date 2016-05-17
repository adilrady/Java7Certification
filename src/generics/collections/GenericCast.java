package generics.collections;

class GenericCast {
	static <E> E cast(Object item) { 
		return (E) item;
	}

	public static void main(String[] args) {
		Object o1 = 10;
		int i = 10;
		Integer anInteger = 10;
		Integer i1 = cast(o1); 
		Integer i2 = cast(i); 
		Integer i3 = cast(10);
		Integer i4 = cast(anInteger);
		System.out.printf("i1 = %d, i2 = %d, i3 = %d, i4 = %d", i1, i2, i3, i4);
		System.out.println("ta ta ta ".replace("ta", "de"));
	}
}