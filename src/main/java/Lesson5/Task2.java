package Lesson5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию: ");
        System.out.println("1. Посчитать площадь прямоугольника");
        System.out.println("2. Посчитать площадь круга");
        System.out.println("3. Посчитать площадь треугольника");

        int operation = scanner.nextInt();
        if (operation < 1 || operation > 3) {
            System.out.println("Неверный выбор операции");
        } else {
            switch (operation) {
                case 1:
                    System.out.println("Введите ширину: ");
                    int width = scanner.nextInt();
                    System.out.println("Введите длину: ");
                    int length = scanner.nextInt();
                    squareOfRect(width, length);
                    break;
                case 2:
                    System.out.println("Введите радиус круга: ");
                    double radius = scanner.nextDouble();
                    squareOfCircle(radius);
                    break;
                case 3:
                    System.out.println("Введите сторону a: ");
                    int a = scanner.nextInt();
                    System.out.println("Введите сторону b: ");
                    int b = scanner.nextInt();
                    System.out.println("Введите сторону c: ");
                    int c = scanner.nextInt();
                    squareOfTriangle(a, b, c);
                    break;
            }
        }
    }

    static void squareOfRect(int width, int length) {
        int result = width * length;
        System.out.println("Площадь фигуры: " + result);
    }

    static void squareOfCircle(double radius) {
        double result = (radius * radius) * 3.14;
        System.out.println("Площадь фигуры: " + result);
    }

    static void squareOfTriangle(int a, int b, int c) {
        int perimeter = (a + b + c) / 2;
        double result = Math.sqrt(perimeter * ((perimeter - a) * (perimeter - b) * (perimeter - c)));
        System.out.println("Площадь фигуры: " + result);
    }
}
