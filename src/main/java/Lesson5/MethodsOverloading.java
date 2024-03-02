package Lesson5;

public class MethodsOverloading {
    public static void main(String[] args) {
//sumOfNumbers(12, 54);
        int num = sumOfNumbers(12, 54);
        System.out.println(num);
        double result = sumOfNumbers(10, 15, 25) + num;
        System.out.println(result);
    }

    static int sumOfNumbers(int num1, int num2) {
        int result = 0;
        result = num1 + num2;
        System.out.println(result);
        return result;
    }

    static int sumOfNumbers(int num1, int num2, int num3) {
        int result = 0;
        result = num1 + num2 + num3;
        System.out.println(result);
        return result;
    }

    static void sumOfNumbers(int num1, int num2, double num3) {
        double result = num1 + num2 + num3;
        System.out.println(result);
    }

    static void sumOfNumbers(int num1, int num2, String str, int num3) {
        double result = num1 + num3;
        System.out.println(str + " " + result);
    }
}

