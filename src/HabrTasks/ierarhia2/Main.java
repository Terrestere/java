package HabrTasks.ierarhia2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

interface Shape extends Comparable<Shape> {
    double getVolume();

    @Override
    default int compareTo(Shape other) {
        return Double.compare(getVolume(), other.getVolume());
    }
}


        abstract class SolidOfRevolution implements Shape {
            double radius;

            public SolidOfRevolution (double radius) {
                this.radius = radius;
            }
            public double getRadius() {
                return radius;
            }
        }

        class SolidOfRevolutionForFunction extends SolidOfRevolution {
            private Function<Double, Double> function;
            private double a;
            private double b;

            public SolidOfRevolutionForFunction(Function<Double, Double> function,double a, double b) {
                super(b - a);
                this.function = function;
                this.a = a;
                this.b = b;
            }

            @Override
            public double getVolume() {
                double sum = 0;
                int iterarions = 10000;
                double delta = (b - a) / iterarions;
                for (int i = 0; i < iterarions; i++) {
                    double x = a + ((b - a) * i / iterarions);
                    sum += Math.pow(function.apply(x), 2) * delta;
                }
                return Math.PI * sum;
            }
        }

class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
    }
    @Override
    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
}

        class Cylinder extends SolidOfRevolution {
            double height;

            public Cylinder(double radius, double height) {
                super(radius);
                this.height = height;
            }

            @Override
            public double getVolume() {
                return Math.PI * 2 * radius * height;
            }
        }

        class Pyramid implements Shape {
            double s;
            double h;

            public Pyramid(double s, double h) {
                this.s = s;
                this.h = h;
            }

            @Override
            public double getVolume() {
                return h * s * 4 / 3;
            }
        }

        class Box implements Shape {
            ArrayList<Shape> shapes = new ArrayList<>();
            private double available;
            private double volume;

            public Box(double available) {
                this.available = available;
                this.volume = available;
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

            @Override
            public double getVolume() {
                return volume;
            }

            public ArrayList<Shape> getShapes(){
                return shapes;
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

                ArrayList<Shape> shapes = box.getShapes();
                Collections.sort(shapes);


                Shape shape = new SolidOfRevolutionForFunction(new Function<Double, Double>() {
                    @Override
                    public Double apply(Double x) {
                        return Math.cos(x);
                    }
                }, 0, 10);
                System.out.println("Function");
                System.out.println(shape.getVolume());
            }
        }

