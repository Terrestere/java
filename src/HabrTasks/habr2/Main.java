package HabrTasks.habr2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10);
        }
        System.out.println(Arrays.toString(arr));
        int sort;
/*        boolean Sotrtflag = false;                    //менее тупой вариант хз для чего
       while (!Sotrtflag){
            Sotrtflag = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                Sotrtflag = false;
                sort = arr[i];
                arr[i] = arr[i + 1];
                arr[i+1] = sort;
                }
            }
        }
*/

        for (int k = 0; k  < arr.length; k++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    sort = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = sort;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
