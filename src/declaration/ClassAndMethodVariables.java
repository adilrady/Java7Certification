package declaration;

public class ClassAndMethodVariables {

	int classVariable;
	
	public void method(){
		int methodVariable;
		System.out.println(classVariable); //Get default value
//		System.out.println(methodVariable);//Does not get defautl value : Compiler Error
	}
}
