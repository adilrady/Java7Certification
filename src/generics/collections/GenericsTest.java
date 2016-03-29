package generics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsTest<T extends Object> {

	public static void main(String[] args) {
		Generics<Double> myGenerics = new Generics<Double>(); //we can also say: new Generics<>() 
//		Generics myGenerics = new Generics<Double>(); // This raises a warning "unsafe type" because of the missing type in the reference type 
		myGenerics.add(new Double(1.1));
		myGenerics.add(new Double(2.2));
		System.out.println(myGenerics.get(0)+" - "+myGenerics.get(1));
		List<Double> doubles = Arrays.asList(11.1, 22.2, 33.3);
		
		System.out.println("-----------------------");
		GenericsTest<Double> test = new GenericsTest<Double>();
		test.lister(doubles);
	}
	
	void lister(List<? extends T> list_Of_T){
		for(T oneT : list_Of_T){
			System.out.println(oneT);
		}
	}
}

class Generics<T>{
	ArrayList<T> listGenerics = new ArrayList<>();
	
	public void add(T element) {
		listGenerics.add(element);
	}
	
	public T get(int index){
		return listGenerics.get(index);
	}
}

