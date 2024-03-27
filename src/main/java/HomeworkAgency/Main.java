package HomeworkAgency;

public class Main {
    public static void main(String[] args) {
        String [][] tours = new String [3][5];

        TourAgency.addTour("Russia", "10", "airplane", "100000", tours);
        TourAgency.addTour("China", "10", "airplane", "120000", tours);
        TourAgency.addTour("France", "10", "airplane", "150000", tours);
        TourAgency.printTours(tours);
        TourAgency.printTheCheapestTour(tours);

    }
}
