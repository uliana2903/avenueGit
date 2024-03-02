package Lesson3;

import java.util.Scanner;
public class Hw6 {
//    Есть число. Нужно на консоль вывести true - если число четное, и false - если нечетное
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число: ");
    int num1 = scanner.nextInt();
    if (num1 % 2 == 0) {
        System.out.println("True");
    } else {
        System.out.println("False");
    }
}
}

