package Task2;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диагональ ромба: ");
        int side = scanner.nextInt();
        if (side % 2 == 0) {
            side++;
            System.out.println("Введите символ: ");
            char symbol = scanner.next().charAt(0);
        }
        rhombus(side);
    }

    static void rhombus(int side) {
        int n = 2;
        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                int edge = Math.abs(i) + Math.abs(j);
                if (edge == n)
                    System.out.println("x");
                else if (edge > n && (i + j) % 2 != 0 || Math.abs(j) == n)
                    System.out.println(" ");
                else System.out.println("x");
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}
