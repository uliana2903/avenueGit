package Lesson6;

public class BubbleSort {
    public static void main(String[] args) {
        int massive[] = new int [] {2, 3, 7, 0, 10};

        boolean isSorted = false;
        int buf;
        while (!isSorted){
           isSorted = true;
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive [i+1]) {
                    isSorted = false;
                    buf = massive[i];
                    massive[i] = massive[i+1];
                    massive[i+1] = buf;
                }

            }
        }
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);

        }
    }
}
