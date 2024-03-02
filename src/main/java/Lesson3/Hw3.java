package Lesson3;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите сторону A: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите сторону B: ");
        int num2 = scanner.nextInt();

        System.out.println("Введите сторону С: ");
        int num3 = scanner.nextInt();

        int perimeter = num1 += num2 += num3;
        System.out.println("Периметр треугольника: " + perimeter);
    }
}
