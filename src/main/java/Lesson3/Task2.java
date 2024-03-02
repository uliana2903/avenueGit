package Lesson3;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 78, 4, 1, 8, 56};
        for(int i = numbers.length - 1; i >= 0; i--){
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
