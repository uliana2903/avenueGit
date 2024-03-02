package Lesson4;

import java.util.Scanner;

public class ForthLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        int nums[] = new int[5];
        int count = scanner.nextInt();
//
//        System.out.println("Введите первое число: ");
//        nums [1] = scanner.nextInt();
//
//        System.out.println("Введите второе число: ");
//        nums [2] = scanner.nextInt();
//
//        System.out.println("Введите третье число: ");
//        nums [3] = scanner.nextInt();

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Введите число N" + i);
            nums[i] = scanner.nextInt();
        }

            }
        }


