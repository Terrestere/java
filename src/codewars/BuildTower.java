package codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class BuildTower {
    public static String[] towerBuilder(int nFloors) {
        int length = 2 * nFloors - 1;
        String[] sol = new String[nFloors];
        int n = Math.round((float) length / 2)-1;
        int m = Math.round((float) length / 2);
        String str = "*";
        for (int i = 0; i < nFloors; i++) {
            StringBuilder floor = new StringBuilder();
            if (nFloors > 1) {
                for (int j = 0; j < length; j++) {
                    floor.append(" ");
                }
            }
            floor.replace(n, m, str);
            sol[i] = String.valueOf(floor);
            n = n - 1;
            m = m + 1;
            str = str + "**";
        }
        return sol;
    }

    public static void main(String[] args) {
        System.out.print(Arrays.toString(towerBuilder(5)));
    }
}
