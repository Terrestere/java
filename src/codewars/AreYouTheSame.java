package codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class AreYouTheSame {
    public static boolean comp(int[] a, int[] b) {
/*        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(b.length);
        System.out.println(a.length);*/
        boolean trig = false;
        ArrayList<Integer> stats = new ArrayList<>();
        while (a.length != stats.size()) {
            stats.add(0);
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.length == 0 && b.length == 0) {
            return true;
        }
        for (int i = 0; i < a.length; i++) {
            first:
            {
                int square = (int) Math.pow(a[i], 2);
                for (int j = 0; j < b.length; j++) {
                    if (square == b[j] && stats.get(j) == 0) {
                        trig = true;
                        stats.set(j, 1);
                        break first;
                    } else if (j == b.length - 1) {
                        return false;
                    }
                }
                if (!trig && i == a.length - 1) {
                    return false;
                }
            }
        }
        return trig;
    }

    public static void main(String[] args) {
/*        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));
        System.out.println(Arrays.toString(a));*/

        /*int[] c = new int[]{2, 2, 3};
        int[] d = new int[]{4, 9, 9};

        System.out.println(comp(c, d));*/

        int[] m = new int[]{};
        int[] n = null;
        System.out.println(comp(m, n));
    }
}
