package Homework9;

import java.util.Scanner;

public class Bonfire implements Light {

    @Override
    public void burn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Костер горит?");
        String yesOrNo = scanner.nextLine();
        if (yesOrNo.equals("Да")) {
            System.out.println("Костер потушен");
        }
        if (yesOrNo.equals("Нет")) {
            System.out.println("Костер разожжен");
        }
    }
}
