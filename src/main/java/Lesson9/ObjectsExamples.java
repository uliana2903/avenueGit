package Lesson9;

public class ObjectsExamples {
    public static void main(String[] args) {
        Person person = new Person("Sergey");
        System.out.println(person.toString());

        System.out.println(person.hashCode());

        System.out.println(person.getClass());


    }
}
