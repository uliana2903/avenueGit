package Homework9;

public class PhoneProgram {
    public static void main(String[] args) {
        Phone phone1 = new Phone(897653489, "6yhf8", 0.98);
        phone1.number = 897653489;
        phone1.model = "6yhf8";
        phone1.weight = 0.98;
        System.out.println("Номер: " + phone1.number + ", " + "модель: " + phone1.model + ", " + "вес: " + phone1.weight);
        Phone phone2 = new Phone(64836847, "7843bhg", 0.87);
        phone2.number = 64836847;
        phone2.model = "7843bhg";
        phone2.weight = 0.87;
        System.out.println("Номер: " + phone2.number + ", " + "модель: " + phone2.model + ", " + "вес: " + phone2.weight);
        Phone phone3 = new Phone(784278374, "iuhei7", 0.1);
        phone3.number = 784278374;
        phone3.model = "iuhei7";
        phone3.weight = 0.1;
        System.out.println("Номер: " + phone3.number + ", " + "модель: " + phone3.model + ", " + "вес: " + phone3.weight);

        phone1.receiveCall("Uliana");
        phone2.receiveCall("Uliana");
        phone3.receiveCall("Uliana");

        phone1.getNumber(897653489);
        phone1.getNumber(64836847);
        phone1.getNumber(784278374);
    }
}
