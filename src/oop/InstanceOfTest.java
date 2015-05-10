package oop;

public class InstanceOfTest {

	public static void main(String[] args) {
		String str = null;
		if (str instanceof String)
			System.out.println("str is String");
		else
			//Prints this because str is null
			System.out.println("str is not String");
	}
}
