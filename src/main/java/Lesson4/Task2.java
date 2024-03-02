package Lesson4;

public class Task2 {
    public static void main(String[] args) {
//        int[][] house = {
//                {1, 2, 3},
//                {3, 5, 6},
//                {5, 3, 2},
//                {1, 4, 5}
//        };
//        for (int i = 0; i < house.length; i++) {
//            for (int j = 0; j < house[i].length; j++) {
//                System.out.print(house[i][j] + " ");
//            }
//            System.out.println();
//        }
        int [][] numbers = new int [8][8];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == j){
                    System.out.print(numbers[i][j] + " ");}
                    else {
                        System.out.print(" " + " ");

                    }
                }
            System.out.println();
            }


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if ((i + j) % 2 == 0){
                    System.out.print(numbers[i][j] + " ");}
                else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        }
    }
