package Lesson3;

public class Hw5 {
    public static void main(String[] args) {
        int money = 1000;
        int costOfSnickers = 35;
        double costOfCandy = 3.5;

        int countCanSnikBuy = money / costOfSnickers;
        int rest = money % costOfSnickers;
        int countCandyBuy = (int) (rest / costOfCandy);
        double totalRest = rest - (countCandyBuy * costOfCandy);
        System.out.println(countCanSnikBuy);
        System.out.println(countCandyBuy);
        System.out.println(totalRest);
    }
}
