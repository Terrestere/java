package HabrTasks.habr4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        int delint = 2;
        int offset = 0;
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10);
        }
        System.out.println(/*"Orig: " + */ Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (delint == arr[i]) {
                offset++;
            } else {
                arr[i - offset] = arr[i];
            }
        }
        int[] newarr = new int[arr.length - offset];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = arr[i];
        }
        System.out.println(/*"Delete indx " + */ Arrays.toString(newarr));
    }
}
