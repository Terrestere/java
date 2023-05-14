package codewars;

import java.util.Arrays;

public class TwoToOne {
    public static String longest(String s1, String s2) {
        String s = s1 + s2;
        char[] st = s.toCharArray();
        Arrays.sort(st);
        String sort = new String(st);
        StringBuilder result = new StringBuilder();
        String alf = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alf.length(); i++) {
            for (int j = 0; j < sort.length(); j++) {
                if (sort.charAt(j) == alf.charAt(i)) {
                    result.append(sort.charAt(j));
                    break;
                }
            }
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String s = TwoToOne.longest("xyaabbbccccdefww", "xxxxyyyyabklmopq");
        System.out.println(s);
    }
}
