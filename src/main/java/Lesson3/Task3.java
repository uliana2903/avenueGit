package Lesson3;

public class Task3 {
    public static void main(String[] args) {
        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] qwer = {'q', 'w', 'e', 'r'};
        char[] abcdqwer = new char[abcd.length + qwer.length];
//        abcdqwer [0] = abcd[0];
//        abcdqwer [1] = abcd[1];
//        abcdqwer [2] = abcd[2];
//        abcdqwer [3] = abcd[3];
//
//        abcdqwer [4] = abcd[0];
//        abcdqwer [5] = abcd[1];
//        abcdqwer [6] = abcd[2];
//        abcdqwer [7] = abcd[3];
        for (int i = 0; i < abcdqwer.length; i++) {
            if (i < abcd.length) {
                abcdqwer[i] = abcd[i];
            } else {
                abcdqwer[i] = qwer[i - abcd.length];
            }
        }
    }
}
