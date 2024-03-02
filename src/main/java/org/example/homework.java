package org.example;

public class homework {
    public static void main(String[] args) {
        int amount = 1000; //сумма
        int priceOfSnickers = 35; //цена сникерса
        double priceOfSweets = 3.5; //цена конфет

        int numberOfSnickers = amount / priceOfSnickers; //количество сникерсов
        System.out.println(numberOfSnickers);

        double numberOfSweets = (amount - (numberOfSnickers * priceOfSnickers)) / priceOfSweets; //количество конфет

        int numberOfSweets2 = (int) numberOfSweets; //перевод из double в int чтобы округлить до меньшего
        System.out.println(numberOfSweets2);

        double leftover = (amount - (numberOfSnickers * priceOfSnickers)) - (numberOfSweets2 * priceOfSweets); //остаток
        System.out.println(leftover);
    }


}
