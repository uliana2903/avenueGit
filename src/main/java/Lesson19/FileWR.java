package Lesson19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String new_str = scanner.nextLine();
        try (FileWriter fileWriter = new FileWriter("text.txt", true)) {
            String str = "Hello world";
            fileWriter.write(str);
            fileWriter.write("\n");
            fileWriter.write(new_str);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fileReader = new FileReader("text.txt")){
            int item;
            while ((item = fileReader.read()) != -1){
                System.out.println((char)item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
