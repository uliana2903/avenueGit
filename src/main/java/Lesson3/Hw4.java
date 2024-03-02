package Lesson3;

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ширину стола: ");
        int wightOfTable = scanner.nextInt();

        System.out.println("Введите длину стола: ");
        int lengthOfTable = scanner.nextInt();

        System.out.println("Введите длину комнаты: ");
        int lengthOfRoom = scanner.nextInt();

        System.out.println("Введите ширину комнаты: ");
        int wightOfRoom = scanner.nextInt();

        int squareOfTable = wightOfTable *= lengthOfTable;
        int squareOfRoom = lengthOfRoom *= wightOfRoom;
        int numsOfTablesInTheRoom = squareOfRoom / squareOfTable;

        System.out.println("Количество столов в комнате: " + numsOfTablesInTheRoom);

    }
}
