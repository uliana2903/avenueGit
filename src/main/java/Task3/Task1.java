package Task3;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char symbols = text.charAt(i);
            int num = symbols;
            if (num >=48 && num<=57 || num>=65 && num <= 90 || num>=97 && num <= 122){
                System.out.println(text);
            } else {
                System.out.println(" ");
            }
        }

//        System.out.println(Arrays.toString(words));
//        byte[] bytes = text.getBytes();
//        System.out.println(bytes);
//        System.out.println(Arrays.toString(bytes));
//

        }

    }

