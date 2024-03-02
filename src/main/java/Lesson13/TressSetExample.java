package Lesson13;

import com.sun.source.tree.Tree;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TressSetExample {
    public static void main(String[] args) {
        TreeSet<String> tressSet = new TreeSet<>();
        tressSet.add("Oleg");
        tressSet.add("Albert");
        tressSet.add("Samat");
        tressSet.add("Rinat");
        for (String temp : tressSet) {
            System.out.println(temp);
        }
        System.out.println(tressSet.getFirst());
        System.out.println(tressSet.last());
        SortedSet <String> sortedSet = tressSet.subSet("Oleg", "Rinat");
        System.out.println(sortedSet);

        System.out.println(tressSet.higher("Rinat"));
        System.out.println();

        NavigableSet<String> navigableSet = tressSet.descendingSet();
        System.out.println();

        SortedSet <String> sortedSet1 = tressSet.headSet("Rinat");
        System.out.println(sortedSet1);

        SortedSet <String> sortedSet2 = tressSet.tailSet("Rinat");
        System.out.println(sortedSet2);

    }
}
