package Homework9;

import java.util.Scanner;

public class Lamp implements Light {

    @Override
    public void burn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Включить или выключить?");
        String onOrOff = scanner.nextLine();
        String color = scanner.nextLine();
        if (onOrOff.equals("Включить")) {
            System.out.println("Каким цветом будет гореть лампа?");
            System.out.println(color);
        }
        if (onOrOff.equals("Выключить")) {
            System.out.println("Лампа не горит");
        }
    }
}