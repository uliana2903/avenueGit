package Homework;

import java.util.Scanner;

public class RandomGame {
    public static final String ESC = "ESC";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minValue = 1;
        int maxValue = 100;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        System.out.println(randomValue);
        int life = 8;
        //String ESC = "ESC";
        //String Esc = new String ("Esc");

        //String esc = scanner.toString();
        System.out.println("Диапазон чисел: от 1 до 100");
        System.out.println("Количество жизней: 8");
        System.out.println("Если хотите закончить игру, введите ESC");
        String esc = scanner.next();

        while (!(esc.equalsIgnoreCase(ESC))) {
            if (life >= 1) {
                System.out.println("Введите число: ");
                int num = scanner.nextInt();
                if (num + 2 == randomValue || num + 1 == randomValue - 1 || num - 2 == randomValue || num - 1 == randomValue + 1 || num + 1 == randomValue || num - 1 == randomValue) {
                    System.out.println("Вы рядом");
                } else if (num == randomValue) {
                    System.out.println("Вы угадали");
                } else {
                    life--;
                    System.out.println("Вы не рядом");
                    System.out.println("Количество жизней: " + life);
                }

            }

        }

    }
}


