package HabrTasks.habr6;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = new int[n];
        int summ = 0;
        int[] arr2 = {1, 2, 10};
        for (int i = 0;i<n; i++) {
            arr[i] = i+1;
        }
        for (int value : arr2) {
            summ += value;
        }

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int h = 0; h < arr.length; h++) {
            for (int g = 0; g < arr2[h]; g++) {
                arrayList.add(h+1);
            }
        }

        System.out.println(arrayList);
        for (int j = 0; j < arr2.length;j++) {

            for (int k=0; k < arr2[j]; k++) {

            }
        }
    }
}
