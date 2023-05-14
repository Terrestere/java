package Homeworks.lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        getNextInt(scanner);

        while (!(scanner.nextLine().equals("stop"))) {

            if (scanner.nextInt() % 2 == 0) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

  //  private boolean che

    private static int getNextInt (Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Error");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
