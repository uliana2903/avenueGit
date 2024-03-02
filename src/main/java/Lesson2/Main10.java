package Lesson2;

public class Main10 {
    public static void main(String[] args) {
        int year = 0;
        for (int money = 9500; money < 200000; money = money * 12) {
            year = year + 1;
        }
        System.out.println(year);
    }
}
