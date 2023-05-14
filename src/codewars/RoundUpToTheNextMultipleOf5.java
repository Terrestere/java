package codewars;

import static java.lang.Math.abs;

public class RoundUpToTheNextMultipleOf5 {
    public static void main(String[] args) {
      //  System.out.println(roundToNext5(-2));
        System.out.println(roundToNext5(-1));
        System.out.println(roundToNext5(-1694932));
      //  System.out.println(roundToNext5(15));
     //   System.out.println(roundToNext5(17));

    }

    public static int roundToNext5(int number) {
        if (number % 5 == 0) {
            return number;
        } else if (number > 0) {
            int i = number / 5;
            return (i + 1) * 5;
        } else {
            int i = abs(number / 5);
            return (i) * 5 * -1;
        }
    }
}
