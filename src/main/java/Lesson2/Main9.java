package Lesson2;

public class Main9 {
    public static void main(String[] args) {
        int even = 0;
        for (int i = 30; i <= 61; i++) {
            if (i % 2 == 0) {
                even = even + 1;
            }
        }
        System.out.println(even);
    }
}
