package Lesson3;

import java.util.Scanner;

public class Hw7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону A: ");
        int a = scanner.nextInt();

        System.out.println("Введите сторону B: ");
        int b = scanner.nextInt();

        System.out.println("Введите сторону C: ");
        int c = scanner.nextInt();

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }
    }
}

