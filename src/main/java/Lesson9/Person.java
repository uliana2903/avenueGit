package Lesson9;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return " ";
    }

    @Override
    public boolean equals (Object object){
        if (object instanceof Person){
            return false;
        }
        Person person = (Person) object;
        return this.name.equals(person.name);
    }
//    @Override
//    public int hashCode(){
//        return;
//    }
}
