package codewars;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class YouReASquare {
    public static boolean isSquare(int n ) {
        int s = (int) sqrt(n);
        return pow(s, 2) == n;
    }

    public static void main(String[] args) {
        boolean a = YouReASquare.isSquare(97648423);
        System.out.println(a);
    }
}
