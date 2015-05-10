package oop;

public class OverloadTest {

	public static void main(String[] args) {
		short sh = 3;
		overload(sh);
	}
	
	/** First: Primitive types */
	public static void overload(short s){
		System.out.println("short");
	}
	public static void overload(int i){
		System.out.println("int");
	}
	public static void overload(long l){
		System.out.println("long");
	}
	/** Second: Wrappers*/
	public static void overload(Short S){
		System.out.println("Short");
	}
	public static void overload(Integer integer){
		System.out.println("Integer");
	}
	public static void overload(Long L){
		System.out.println("Long");
	}
	/** Third: Var-Args */
	public static void overload(short ...s){
		System.out.println("short ...");
	}
	public static void overload(int ...i){
		System.out.println("int ...");
	}
	public static void overload(long ...l){
		System.out.println("long ...");
	}
	
}
