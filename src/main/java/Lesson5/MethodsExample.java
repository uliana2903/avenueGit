package Lesson5;

public class MethodsExample {
    public static void main(String[] args) {
//        System.out.println("Hello");
// printHello();
}
static void printHello(){
        System.out.println("Hello world");
    }
    void printBye(){
        System.out.println("Пока!");
        }
        static void printall(){
        printHello();
        }

        static void sumOfNumbers(int ...nums){
        int result = 0;
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
                result = result + nums[i];
            }

        }
    }

