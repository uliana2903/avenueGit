package Lesson13;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet <String> hashSet = new HashSet<>();
        hashSet.add("Anton");
        hashSet.add("Albert");
        hashSet.add("Oleg");
        hashSet.add("Olya");
        hashSet.add("Samat");
        hashSet.add("Rinat");
        boolean isAdded = hashSet.add("Oleg");
        System.out.println(isAdded);

    }
}
