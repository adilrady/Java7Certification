package general;


public class PassVariable {
    public enum Coffee{
        Nespresso, Nescafee
    }
    static int k = 6;
    
    
    Person person;
    

    public static void main(String [] args){
    	
        if((4 ^ k) == 2)
            System.out.println("(4 ^ k) == 1 return true");
//        System.out.println("Spliter : "+"\""+"ABC".split("")[0]+"\"");
//        System.out.println(2.3+3.1);
        printShort((short) 7);  //Compulsory Cast (Because downCast -> smaller container)
//        System.out.println(Coffee.values());
        int Int = 3;
        Person person = new Employee("Ahmed", 22);//new Person("Ahmed", 22);
        Employee e = new Employee("Ali", 22);
        if(person instanceof Employee)
            System.out.println("Person is employee");
        modifyPrimitiveVariable(Int);
        System.out.println("Int After : "+Int); //No Change
        modifyReferenceVariable(person);
        System.out.println("Name of p After : "+person.getName()); //Change

        Employee emp = new Employee("Ali", 33);
    }
    
    public static void printShort(short s){
        System.out.println(s);
    }

    public static void modifyPrimitiveVariable(int primitiveVar){
        primitiveVar = 20;
    }

    public static void modifyReferenceVariable(Person referenceVar){
        referenceVar.setName("Mohamed");
    }
}
