package innerclass;

public class StaticInnerClass {

	public static void main(String[] args) {
		System.out.println(new Outer1.Inner1().text);
		System.out.println(Outer2.Inner2.text);
		System.out.println(new Outer3().new Inner3().text);
	}
}

class Outer1{
	static class Inner1{
		final String text = "insideInner1";
	}
}

class Outer2{
	static class Inner2{
		static final String text = "insideInner2";
	}
}

class Outer3{
	class Inner3{
		static final String text = "insideInner3";
	}
}
