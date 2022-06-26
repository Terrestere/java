package jakov.Cars;

public class Car {
    public void start() {
        System.out.println("start");

    }

    public void stop() {
        System.out.println("stoop");

    }

    public int drive(int howlong) {
        int distance = howlong * 60;
        System.out.println(distance);
        return distance;
    }
}
