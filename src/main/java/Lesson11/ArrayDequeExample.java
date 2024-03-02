package Lesson11;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque <String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Uliana");
        arrayDeque.add("Anton");
        arrayDeque.add("Sergey");
        arrayDeque.add("Vladimir");
//        System.out.println()
//        arrayDeque.addLast();

        while (arrayDeque.peek() != null){
            System.out.println(arrayDeque.pop());
            System.out.println(arrayDeque);
        }
    }
}
