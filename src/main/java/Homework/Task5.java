package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int length = scanner.nextInt();
        int[] nums = new int[length];
        System.out.println("Введите элементы: ");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Массив: " + Arrays.toString(nums));
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }
        System.out.println(min);
        System.out.println(max);

    }
}

