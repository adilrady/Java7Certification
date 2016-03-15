package generics.collections;

public class Person
{

    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Name: "+name+" - Age: "+age;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Person)
            return this.name.equals(((Person) obj).name);
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 + age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void setName(String name){
    	this.name = name;
    }
}
