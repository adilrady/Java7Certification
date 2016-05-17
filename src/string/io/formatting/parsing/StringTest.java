package string.io.formatting.parsing;

public class StringTest {

	public static void main(String[] args) {
		
		String s = "s";
		System.out.println(1+10+s+1+10); //11s110
		
		
		String two = "2";
		System.out.println("1 + 2 + 3 + 4 = "+ 1 + Integer.parseInt(two) + 3 + 4); //1 + 2 + 3 + 4 = 1234
		
		String test = "I am preparing for OCPJP";
		String[] tokens = test.split("\\S");
		System.out.println(tokens.length+" : ");
		for (String string : tokens) {
			System.out.println(">"+string+"<");
		}
	}
}
