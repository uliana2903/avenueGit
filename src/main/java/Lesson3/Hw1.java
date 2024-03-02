package Lesson3;

public class Hw1 {
    public static void main(String[] args) {
//        Есть массив цифр: {3,5,8,3,55,4,1,65,36,98}
//1) Вывести на консоль через ячейку
//2) Вывести на консоль массив с обратной стороны

        int[] numbers = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i++]);
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}





