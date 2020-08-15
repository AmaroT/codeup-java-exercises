import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        String[] Person = {"Amaro", "Alex", "Rick"};
        for (int i = 0; i < Person.length; i += 1) {
            System.out.println(Person[i]);
        }
        Person[] addingPerson = new Person[]{new Person("Spunky")};
        addingPerson = addPerson(addingPerson, new Person ("Tito"));
        addingPerson = addPerson(addingPerson,new Person("MJ"));

        for(Person p: addingPerson){
            System.out.println(p.getName());
        }
    }
    public static Person[] addPerson(Person[] group, Person person) {
        Person[] result = new Person[group.length + 1];
        for (int i = 0; i < group.length; i++) {
            result[i] = group[i];
        } result[group.length] = person;
        return result;
    }

}
