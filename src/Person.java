public class Person {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String sayHello(){
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        Person john = new Person("John");
//        Person jane = new Person("John");
//        System.out.println(john.getName().equals(jane.getName()));
//        System.out.println(john == jane);
        Person john = new Person("John");
        Person jane = john;
        System.out.println(john == jane);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}
