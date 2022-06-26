package jakov.Cars;

public class CarOwner {
    public static void main(String[] args) {
        Car mycar = new Car();
        JamesBondCar cars = new JamesBondCar();
        mycar.start();
        mycar.stop();
        mycar.drive(4);

        cars.drive(1);
    }
}
