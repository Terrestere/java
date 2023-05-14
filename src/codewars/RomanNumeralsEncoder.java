package codewars;

        /*Create a function taking a positive integer as its parameter and returning a string containing
        the Roman Numeral representation of that integer.

        Modern Roman numerals are written by expressing each digit separately starting
        with the left most digit and skipping any digit with a value of zero.
        In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
        2008 is written as 2000=MM, 8=VIII; or MMVIII.
        1666 uses each Roman symbol in descending order: MDCLXVI.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RomanNumeralsEncoder {
    public static void main(String[] args) {
        int[] lat = {1000, 500, 100, 50, 10, 9, 5, 4, 1};
        String[] roman = {"M", "D", "C", "L", "X", "IX", "V", "IV", "I"};
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < lat.length; i++) {
            while (num >= lat[i]) {
                num -= lat[i];
                stringBuilder.append(roman[i]);
            }
        }
        System.out.println(stringBuilder);


    }
}
