package Lesson7;

public class NewHumanProgram {
    public static void main(String[] args) {
        NewHuman newHuman = new NewHuman("Anton", 12);
        System.out.println(newHuman.getName() + newHuman.getAge());
        changeName(newHuman);
    }

    static void changeName(NewHuman newHuman){
newHuman.setName("Albert");
    }
}
