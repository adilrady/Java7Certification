package general;


public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName(){
        return this.name;
    }
    
}

class Employee extends Person{

    public Employee(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }
    
    public void specialToEmployee(){
        System.out.println("special To Employee");
    }
}