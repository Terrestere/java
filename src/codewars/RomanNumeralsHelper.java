package codewars;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsHelper {

    public static String toRoman(int n) {
        String[] roman = {"I", "V", "X", "L", "C", "D", "M"};
        int[] latin = {1, 5, 10, 50, 100, 500, 1000};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = latin.length - 1; i >= 0; i--) {
            int count = 0;
            int count2 = 0;
            while (n >= latin[i]) {
                count++;
                n -= latin[i];
            }
            int ost = 0;
            ost = n;
            if (i >= 1) {
                while (ost >= latin[i - 1]) {
                    count2++;
                    ost -= latin[i - 1];
                }
            }
            if (count == 4) { //4/40/400
                stringBuilder.append(roman[i]);
                stringBuilder.append(roman[i + 1]);
            } else if (count2 == 4 && count == 1) { // 9/90/900
                stringBuilder.append(roman[i - 1]);
                stringBuilder.append(roman[i + 1]);
                n = ost;
            } else {
                stringBuilder.append(roman[i].repeat(Math.max(0, count)));
            }
        }
        return String.valueOf(stringBuilder);
    }

    private static final Map<Character, Integer> roman = new HashMap<>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    public static int fromRoman(String romanNumeral) {
        int sum = 0;
        int n = romanNumeral.length();

        for (int i = 0; i < n; i++) {
            if (i != n - 1 && roman.get(romanNumeral.charAt(i)) < roman.get(romanNumeral.charAt(i + 1))) {
                sum += roman.get(romanNumeral.charAt(i + 1)) - roman.get(romanNumeral.charAt(i));
                i++;
            } else {
                sum += roman.get(romanNumeral.charAt(i));
            }
        }
        return sum;
    }



/*        String[] roman = {"M", "D", "C", "L", "X", "V", "I"};
        int[] latin = {1000, 500, 100, 50, 10, 5, 1};
        int num = 0;
        String[] str = romanNumeral.split("");
        for (int i = 0; i < roman.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (i > 2 && roman[i].equals(str[j]) && roman[i - 2].equals(str[j + 1]) && j < str.length - 2) {
                    num += (latin[i] - latin[i + 2]);
                } else if (i == 5 && j > 1 && roman[i].equals(str[j]) && roman[i + 1].equals(str[j - 1])) {
                    num += (latin[i] - latin[i + 1]);
                    return num;
                } else if (roman[i].equals(str[j])) {
                    num += latin[i];
                }
            }
        }
        return num;
}*/

    public static void main(String[] args) {
        //System.out.println(toRoman(4113));
        //System.out.println(toRoman(92));
        //System.out.println(toRoman(965)); //CMLXV
        //System.out.println(toRoman(99));
        System.out.println(toRoman(9));
        //System.out.println(toRoman(149));
        //System.out.println(toRoman(44));
        //System.out.println(toRoman(141)); //CXLI  was CXXXXI
        //System.out.println(toRoman(149));
        //System.out.println("MMMMCXIII" + " - " + fromRoman("MMMMCXIII"));
        //System.out.println("MMMMCXIV" + " - " + fromRoman("MMMMCXIV"));
        //System.out.println("MMMLXXV" + " - " + fromRoman("MMMLXXV"));
    }
}
