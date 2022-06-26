package com.first;

public class Car extends Transport implements ILights {
    private boolean isOn;
    public Engine engine = new Engine();
    public Car (float _speed, int _weight, String _color, byte[] _coordinate){ //конструктор
        super(_speed, _weight, _color, _coordinate);

    }
    public Car(){}

    @Override
    public void moveObject(float speed) {
        System.out.println("Наш объект двигается со скоростью: " + speed);
    }

    @Override
    public void setLight(boolean set) {
        this.isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("Мы моргаем фарами");
    }
}
