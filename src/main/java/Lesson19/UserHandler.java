package Lesson19;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserHandler {


    public static void addingUser(User user) {
        try (FileWriter fileWriter = new FileWriter("users.txt", true)) {
            fileWriter.write(user.getName() + " " + user.getSurname() + " , " + user.getAge() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readInfo() {
        try (FileReader fileReader = new FileReader("users.txt")) {
            int item;
            while ((item = fileReader.read()) != -1) {
                System.out.print((char) item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readSpecialInfo(String name) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("users.txt"));
            for (String line : lines) {
                String[] lineArray = line.split(" ");
                for (String nameFromArray : lineArray) {
                    if (nameFromArray.equalsIgnoreCase(name)) {
                        System.out.println(nameFromArray);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию: ");
        System.out.println("1. Добавить пользователя");
        System.out.println("2. Вывести информаицю о пользователе");
        System.out.println("3. ИЗменить информацию о пользователе");

        int addOrDisplay = scanner.nextInt();
        if (addOrDisplay == 1) {
            System.out.println("Введите имя: ");
            String name = scanner.next();
            System.out.println("Введите фамилию: ");
            String surname = scanner.next();
            System.out.println("Введите возраст: ");
            int age = scanner.nextInt();
            User user = new User(name, surname, age);
            addingUser(user);
        } else if (addOrDisplay == 2) {
            readInfo();
        } else if (addOrDisplay ==3){
            System.out.println("Введите имя пользователя: ");
String name = scanner.next();
readSpecialInfo(name);
            System.out.println("Введите имя: ");
            String newName = scanner.next();
            System.out.println("Введите фамилию: ");
            String newSurname = scanner.next();
            System.out.println("Введите возраст: ");
            int newAge = scanner.nextInt();
            User newUser = new User(name, newSurname, newAge);
            addingUser(newUser);
        }

    }
}



