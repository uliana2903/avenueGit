package Lesson3;

public class Hw2 {
    public static void main(String[] args) {
//        Есть текст "Я буду учиться лучше"
//        1) Напечатать на консоль каждое слово в отдельной строке
//        2) Напечатать на консоль каждое слово в обратном порядке

        String text = "Я буду учиться лучше";
        String[] parts = text.split(" ");
        for (int i = 0; i < parts.length; i++){
            System.out.println(parts[i]);
            System.out.println(new StringBuilder(parts[1]).reverse());
        }
        char[] reverseText = text.toCharArray();
            for (int i = reverseText.length - 1; i >= 0; i--) {
                System.out.print(reverseText[i]);
            }
        }
    }



