package HabrTasks.ierarhia;

import java.util.ArrayList;

class Shape {
    protected double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}

    class SolidOfRevolution extends Shape {
        protected double radius;

        public SolidOfRevolution(double volume, double radius) {
            super(volume);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }
    }

    class Pyramid extends Shape {
       protected double s;
       protected double h;

        public Pyramid (double s, double h) {
            super(h * s * 4 / 3);
            this.s = s;
            this.h = h;
        }
    }

    class Cylinder extends SolidOfRevolution {
        protected double height;

        public Cylinder(double radius, double height) {
            super(Math.PI * 2 * radius * height, radius);
            this.height = height;
        }
    }

    class Ball extends SolidOfRevolution {

        public Ball (double radius) {
            super(4/3 * Math.PI * Math.pow(radius, 3), radius);
        }

    }

    class Box extends Shape {

        private ArrayList<Shape> shapes = new ArrayList<>();
        private double available;

        public Box(double available) {
            super(available);
            this.available = available;
        }

        public boolean add(Shape shape) {
            if (available >= shape.getVolume()) {
                shapes.add(shape);
                available -= shape.getVolume();
                return true;
            } else {
                return false;
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Ball ball = new Ball(4.5);
            Cylinder cylinder = new Cylinder(2, 2);
            Pyramid pyramid = new Pyramid(100, 100);

            Box box = new Box(1000);
            System.out.println(box.add(ball));
            System.out.println(box.add(cylinder));
            System.out.println(box.add(pyramid));
        }
    }


