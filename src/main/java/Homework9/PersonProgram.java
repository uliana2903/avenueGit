package Homework9;

public class PersonProgram {
    public static void main(String[] args) {
        Person person = new Person("Ульяна", 22);
        Person person1 = new Person();

        person.move();
        person.talk();
        person1.move();
        person1.talk();
    }
}
