package Lesson8;

public class Employee extends Person{
    String company;
    public Employee(String name, String surname, int age, String company) {
        super(name, surname, age);
        this.company = company;
    }
    @Override
    public void display(){
        System.out.println(name);
        System.out.println(company);
    }

}
