package Lesson5;

public class Figure {
    public static void main(String[] args) {
        int[][] numbers = new int[9][9];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (j >= i) {
                    numbers[i][j] = 1;
                } else {
                    numbers[i][j] = 0;
                }
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j] + " ");
            }
        }

    }
}
