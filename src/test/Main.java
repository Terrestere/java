package test;
import java.util.Random;

import java.util.Scanner;
/*Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.

        Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.*/
public class Main {
    static class NewThread implements Runnable {
        Thread t;

        NewThread() {
            t = new Thread(this, "Demonstracia");
            System.out.println("Dochernyi " + t);
            t.start();
        }


        public void run() {

            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println("Doche " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Doch prervan");
            }
            System.out.println("Docher zavershon");
        }
        }


        public static void main(String[] args) {
            new NewThread();

            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println("Glavnyi potok " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Glavni potok zavershon");
            }

            class MyClass{
                int a;
                int b;

                MyClass(int i, int j) {
                    a = i;
                    b = j;
                }

                MyClass(int i) {
                    a = i;

                }
            }
        }

}