package Homeworks.lesson3;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Summa2chisel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter operator (+ or a(absolute)): ");
        char mode = scanner.next().charAt(0);

        switch (mode) {
            case '+':
                System.out.println(Check(scanner) + Check(scanner));
                break;
            case 'a':
                System.out.println("Enter 3 int number: ");
                System.out.println("Enter first: ");
                int num1 = Check(scanner);
                System.out.println("Enter second: ");
                int num2 = Check(scanner);
                System.out.println("Enter third: ");
                int num3 = Check(scanner);
                System.out.println(Module(num1, num2, num3));
                break;
            default:
                System.out.println("Error");
                break;
        }

    }

    private static int Check(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Error");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static int Module(int num1, int num2, int num3) {
        int min;
        if (abs(num1) < abs(num2)) {
            min = num1;
        } else if (abs(num2) < abs(num3)) {
            min = num2;
        } else {
            min = num3;
        }
        return min;
    }
}

