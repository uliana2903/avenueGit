package Homework9;

public class Phone {
    int number;
    String model;
    double weight;

    void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    int getNumber(int userNumber) {
        number = userNumber;
        return number;
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }
}

