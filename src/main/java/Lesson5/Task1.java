package Lesson5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            multOfNums(num1, num2);
        } else if (num1 < num2) {
            sumOfNums(num1, num2);
        } else if (num1 == num2) {
            printHello();
        }
    }

    static void multOfNums(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
    }

    static void sumOfNums(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }

    static void printHello() {
        System.out.println("Привет");
    }
}
