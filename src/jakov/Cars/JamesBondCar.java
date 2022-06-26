package jakov.Cars;

public class JamesBondCar extends Car{
    @Override
    public int drive(int howlong) {
        int distance = howlong * 180;
        System.out.println(distance);
        return super.drive(distance);
    }
}
