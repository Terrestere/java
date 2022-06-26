package DvoichniiLineini;

import java.util.Arrays;


public class Main {
    public static int Dvoichni (int[] arr, int elemenSearch) {
        int firstIndex = 0;
        int lastindex = arr.length - 1;

        while (firstIndex <= lastindex) {
            int middleindex = (firstIndex + lastindex) / 2;
            if (arr[middleindex] == elemenSearch) {
                return middleindex;
            } else if (arr[middleindex] > elemenSearch) {
                lastindex = middleindex - 1;
            } else if (arr[middleindex] < elemenSearch) {
                firstIndex = middleindex + 1;
            }

        }
        return -1;
    }

    public static int Lineini(int[] arr, int elementSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementSearch) {
                return i;
            }
        }
        return -1;
    }

    private static int[] array(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (n*Math.random());
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = 1000000;
        int elemenSearch = 4;
        int[] array = array(n);
        //System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
        long time = System.currentTimeMillis();
        Lineini(array, elemenSearch);
       // System.out.println(Lineini(array, elemenSearch));
        System.out.println("One: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        Dvoichni(array, elemenSearch);
       // System.out.println(Dvoichni(array, elemenSearch));
        System.out.println("Two: " + (System.currentTimeMillis() - time));

        }
}
