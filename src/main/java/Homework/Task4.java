package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число с пробелами между цифрами: ");
        int[] numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }

//    числа с клавиатуры в массиве
        int[] nums1 = Arrays.copyOfRange(numbers, 0, numbers.length / 2);
        int[] nums2 = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length);

//        деление общего массива на 2 части
        int sumNums1 = 0;
        for (int i = 0; i < nums1.length; i++) {
            sumNums1 += nums1[i];
        }
//        сумма первого массива

        int sumNums2 = 0;
        for (int i = 0; i < nums2.length; i++) {
            sumNums2 += nums2[i];
        }
//        сумма второго массива

        if (sumNums1 == sumNums2) {
            System.out.println("Ваш билет счастливый");
        } else {
            System.out.println("Ваш билет несчастливый");
        }
    }
}
