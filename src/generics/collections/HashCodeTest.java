package generics.collections;

import java.util.HashMap;
import java.util.Map;


public class HashCodeTest
{

	public static void main(final String[] args)
	{
		Map<Person, Car> parking = new HashMap<Person, Car>();
		Person ahmed = new Person("Ahmed", 30);
		Person mohamed = new Person("Mohamed", 20);
		Person kamal = new Person("Kamal", 40);
		
		Car bmw = new Car("bmw", 5);
		Car renault = new Car("renault", 7);
		Car audit = new Car("audi", 2);
		
		parking.put(ahmed, audit);
		parking.put(mohamed, renault);
		parking.put(kamal, bmw);
		
		//Without equals() neither hashcode():
		System.out.print(parking.containsKey(kamal)+" : ");
		System.out.println(parking.get(kamal));
		
		kamal.setAge(12);
		//With equals() and hashcode():
		System.out.print(parking.containsKey(kamal)+ " : ");
		System.out.println(parking.get(kamal));

	}
}
