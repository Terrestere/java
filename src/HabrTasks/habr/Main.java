package HabrTasks.habr;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double [] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        System.out.println(Arrays.toString(arr));
        double max = arr[0];
        double min = arr[0];
        double avg = 0;
        for (double v : arr) {
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
        }
        for (double s : arr) {
            avg += s;
            System.out.println(avg);
        }
        avg /= n;

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Average = " + avg);

    }

}
