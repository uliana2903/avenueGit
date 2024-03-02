package Lesson2;

public class Main6 {
    public static void main(String[] args) {
        int money = 10000000;

        for (int month = 0; month < 12 * 15; month++){
            money = money + ((money/100 * 13) / 12);
        }
        System.out.println(money);
    }
}
