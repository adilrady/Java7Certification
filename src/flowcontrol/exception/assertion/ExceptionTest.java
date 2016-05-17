package flowcontrol.exception.assertion;

public class ExceptionTest {

	public static void main(String[] args) {
		Person ahmed = new Person();
		try {
			System.out.println(ahmed.firstName.length());
		} catch (Exception e) {
			if(e.getMessage() == null){
				System.out.println("MSG Nulllllll");
			}
			System.out.println("Heeee : "+e);
		}
		
		try{
			System.out.println("try without catch !!! YEEEES");
		}finally{
			System.out.println("In finally");
		}
	}
}

class Person {

	String firstName;
	String lastName;

}