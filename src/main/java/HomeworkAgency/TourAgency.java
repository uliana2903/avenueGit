package HomeworkAgency;

import java.util.Arrays;

public class TourAgency {
    public static void addTour(String country, String days, String transport, String cost, String[][] tourArray) {
        for (int i = 0; i < tourArray.length; i++) {
            if (tourArray[i][0] == null) {
                tourArray[i][0] = String.valueOf(i + 1);
                tourArray[i][1] = country;
                tourArray[i][2] = days;
                tourArray[i][3] = transport;
                tourArray[i][4] = cost;
                break;
            }
        }
    }
    public static void printTours(String[][] tourArray) {
        System.out.println("Тour:");
        for (int i = 0; i < tourArray.length; i++) {
            if (tourArray[i][0] != null) {
                System.out.println("Tour " + tourArray[i][0] + ": " + tourArray[i][1] + ", " + tourArray[i][2] + " days, " + tourArray[i][3] + ", cost: " + tourArray[i][4]);
            }
        }
    }


    public static void printTheCheapestTour(String[][] tourArray) {
        int[] toursPriceArray = new int[tourArray.length];
        for (int i = 0; i < tourArray.length; i++) {
            String stringPrice = tourArray[i][4];
            int toursPrice = Integer.parseInt(stringPrice);
            toursPriceArray[i] = toursPrice;
        }

        int minPrice = toursPriceArray[0];
        int minIndex = 0;
        for (int i = 1; i < toursPriceArray.length; i++) {
            if (toursPriceArray[i] < minPrice) {
                minPrice = toursPriceArray[i];
                minIndex = i;
            }
        }
        System.out.println("The cheapest tour:");
        System.out.println(tourArray[minIndex][1] + ", " + tourArray[minIndex][2] + " days, " + tourArray[minIndex][3] + ", cost: " + tourArray[minIndex][4]);
    }
}










