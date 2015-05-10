package declaration;

public class VarArg {

	public static void printNumbers(int ...numbers){
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("<"+numbers[i]+">");
		}
	}
	
	public static void main(String[] args) {
		//Call with empty parameter -> OK
		printNumbers();
		printNumbers(new int[]{1,2,3});
//		int [] tab = new int[3]{1,2,3};
	}
}
