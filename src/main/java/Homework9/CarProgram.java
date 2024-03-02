package Homework9;

public class CarProgram {
    public static void main(String[] args) {
        Truck truck = new Truck();
        SmallCar smallCar = new SmallCar();

        smallCar.speedUp();
        truck.speedUp();
        smallCar.stop();
        truck.stop();
        smallCar.transportPassengers();
        truck.transportLoads();
    }
}
