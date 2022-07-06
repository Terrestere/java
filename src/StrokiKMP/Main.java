package StrokiKMP;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "aabaabaaaaaabaabaabaabbaaab";
        String sample = "aabaab";

        System.out.println(searchNaive(text, sample));
        System.out.println(Arrays.toString(prefixFunction(sample)));
        System.out.println(KMP(text, sample));

    }

    static ArrayList<Integer> searchNaive(String text, String sample) {
        ArrayList<Integer> foundPosition = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            int j = 0;
            while (j < sample.length() && i + j < text.length() && sample.charAt(j) == text.charAt(i + j)) {
                j++;
            }
            if (j == sample.length() ) {
                foundPosition.add(i);
            }
        }
        return foundPosition;
    }

    static int[] prefixFunction(String sample) {
        int [] values = new int[sample.length()];
        for (int i = 1; i < sample.length(); i++) {
            int j = 0;
            while (i+j<sample.length() && sample.charAt(j) == sample.charAt(i+j)) {
                values[i + j] = Math.max(values[i + j], j + 1);
                j++;
            }
        }
        return values;
    }

    public static ArrayList<Integer> KMP(String text, String sample) {
        ArrayList<Integer> found = new ArrayList<>();

        int[] prefixFunction = prefixFunction(sample);

        int i = 0;
        int j = 0;
        while (i<text.length()) {
            if (sample.charAt(j) == text.charAt(i)) {
                j++;
                i++;
            }
            if (j == sample.length()) {
                found.add(i - j);
                j = prefixFunction[j - 1];
            } else if (i < text.length() && sample.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = prefixFunction[j - 1];
                } else {
                    i = i + 1;
                }
            }
        }
        return found;
    }

}