package codewars;

import java.util.*;

public class PickPeaks {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 4, 1, 2, 3, 2, 1};
        int[] array1 = {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3};
        int[] array2 = {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1};
        int[] array3 = {2, 1, 3, 1, 2, 2, 2, 2, 1};
        int[] array4 = {2, 1, 3, 1, 2, 2, 2, 2};
        System.out.println(getPeaks(array));
        System.out.println(getPeaks(array1));
        System.out.println(getPeaks(array2));
        System.out.println(getPeaks(array3));
        System.out.println(getPeaks(array4));
    }

    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("pos", new ArrayList<>());
        map.put("peaks", new ArrayList<>());
        int posMAX = 0;
        int peaksMAX = 0;
        boolean Now = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                posMAX = i + 1;
                peaksMAX = arr[i + 1];
                Now = true;
            } else if (Now && arr[i] > arr[i + 1]) {
                map.get("pos").add(posMAX);
                map.get("peaks").add(peaksMAX);
                Now = false;
            }
        }
        return map;
    }
}
