package generics.collections;

import java.util.HashMap;
import java.util.Map;


public class HashCodeTest
{

	public static void main(final String[] args)
	{
		Map<Person, Car> parking = new HashMap<Person, Car>();
		Person mohamed = new Person("Mohamed", 20);
		Person ahmed = new Person("Ahmed", 30);
		Person kamal = new Person("Kamal", 40);
		Person ahmed_2 = new Person("Ahmed", 30);
		
		Car bmw = new Car("bmw", 5);
		Car renault = new Car("renault", 7);
		Car audit = new Car("audi", 2);
		
		parking.put(ahmed, audit);
		parking.put(mohamed, renault);
		parking.put(kamal, bmw);
		parking.put(ahmed_2, renault);
		System.out.println(parking.size());
		
		System.out.print(parking.containsKey(ahmed)+" : ");
		System.out.println(parking.get(ahmed));
		
		kamal.setAge(12);
		//ContainsKey returns false because the age of kamal has changed
		//And the age attribute is used in the hash code of Person
		System.out.println(kamal);
		System.out.print(parking.containsKey(kamal)+ " : ");
		System.out.println(parking.get(kamal));
		
		Person kamal_2 = new Person("Kamal", 40);
		
		//Return true as far as the hashMap uses hashcode and equals 
		//NOT object reference to search in the Map.
		System.out.print(parking.containsKey(kamal_2)+ " : ");
		System.out.println(parking.get(kamal));
	}
}
