package Lesson8;

public class Person {
     String name;
     String surname;
     int age;
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public void display(){
        System.out.println("Имя" + name + "Фамилия" + surname + "Возраст" + age);
    }
}
