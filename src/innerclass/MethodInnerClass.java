package innerclass;

public class MethodInnerClass {

	private static int var = 10; 
	public static void container(){
		
		// Allowed modifiers: abstract - final
		// Not Allowed: public - static 
		final class MethodInner {
			public void innerMethod(){
				System.out.println("privat outer variable : "+var);
			}
		}
		
		new MethodInner().innerMethod();
	}
	
	public static void main(String[] args) {
		container();
	}
}
