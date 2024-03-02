package Lesson4;

import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону ромба: ");
        int side = scanner.nextInt();
        if (side % 2 == 0) {
            side++;
        }
        rhombus(side);
    }

    static void rhombus(int side) {
        int x = 1;
        int empty = side / 2;
        for (int i = 1; i <= side; i++) {

            for (int j = 1; j <= empty; j++) {
                System.out.println(" ");
            }
            for (int j = 1; j <= x; j++) {
                System.out.print("x");
            }
            System.out.println();

            if (i <= side / 2) {
                empty--;
                x += 2;
            } else {
                empty++;
                x -= 2;
            }
        }
    }
}


