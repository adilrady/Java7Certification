package flowcontrol.exception.assertion;

import java.util.ArrayList;

public class EnhancedForLoop {

	public static void main(String[] args) {
		ArrayList<Animal> listAnimals = new ArrayList<Animal>();
		listAnimals.add(new Animal("dodo", 20.20));
		listAnimals.add(new Animal("didi", 10.30));
		listAnimals.add(new Animal("dada", 16.40));
		listAnimals.add(new Animal("dede", 29.50));
		
		System.out.println("------------ Original ----------");
		for (Animal animal : listAnimals) {
			System.out.println(animal);
		}
		
		for (Animal animal : listAnimals) {
			animal.setName("sasa");
		}
		System.out.println("------------ 1st modif (sasa)----------");
		for (Animal animal : listAnimals) {
			System.out.println(animal);
		}
		
		for (Animal animal : listAnimals) {
			animal = new Animal("zaza", 21.21); //Has no effect after end of the loop
		}
		//No Change
		System.out.println("------------ 2nd modif (zaza)----------");
		for (Animal animal : listAnimals) {
			System.out.println(animal);
		}
	}
}


class Animal{
	private String name;
	private double weight;
	
	public Animal(String name, double weight){
		this.name = name;
		this.weight = weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return this.name+":"+this.weight;
	}
}