package codewars;

import java.util.*;

public class ObservedPin {
    public static List<String> getPINs(String observed) {
        int len = observed.length();

        for (int i = len; i < 8; i++) {
            observed += ':';
        }
        int LenRes = 1, index = 0;
        int[] L = new int[8];
        int[] I = new int[8];
        for (int i = 0; i < 8; i++) {
            int temp = 1;
            L[i] = HashPins(String.valueOf(observed.charAt(i) - 48)).length;
            if (L[i] > 1) {
                I[i] = 1;
                temp = L[i] - 1;
            }
            LenRes *= temp;
        }

        String[] str = new String[LenRes];

        for (int i7 = I[7]; i7 < L[7]; i7++) {
            for (int i6 = I[6]; i6 < L[6]; i6++) {
                for (int i5 = I[5]; i5 < L[5]; i5++) {
                    for (int i4 = I[4]; i4 < L[4]; i4++) {
                        for (int i3 = I[3]; i3 < L[3]; i3++) {
                            for (int i2 = I[2]; i2 < L[2]; i2++) {
                                for (int i1 = I[1]; i1 < L[1]; i1++) {
                                    for (int i0 = I[0]; i0 < L[0]; i0++) {
                                        str[index++] = HashPins(String.valueOf(observed.charAt(0) - 48))[i0] +
                                                HashPins(String.valueOf(observed.charAt(1) - 48))[i1] +
                                                HashPins(String.valueOf(observed.charAt(2) - 48))[i2] +
                                                HashPins(String.valueOf(observed.charAt(3) - 48))[i3] +
                                                HashPins(String.valueOf(observed.charAt(4) - 48))[i4] +
                                                HashPins(String.valueOf(observed.charAt(5) - 48))[i5] +
                                                HashPins(String.valueOf(observed.charAt(6) - 48))[i6] +
                                                HashPins(String.valueOf(observed.charAt(7) - 48))[i7];
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
       // Arrays.sort(str);
        return List.of(str);
    }

    public static String[] HashPins(String search) {
        HashMap<String, String[]> Pins = new HashMap<>();
        Pins.put("0", new String[]{"", "8", "0"});
        Pins.put("1", new String[]{"", "1", "2", "4"});
        Pins.put("2", new String[]{"", "1", "2", "3", "5"});
        Pins.put("3", new String[]{"", "2", "3", "6"});
        Pins.put("4", new String[]{"", "1", "4", "5", "7"});
        Pins.put("5", new String[]{"", "2", "4", "5", "6", "8"});
        Pins.put("6", new String[]{"", "3", "5", "6", "9"});
        Pins.put("7", new String[]{"", "4", "7", "8"});
        Pins.put("8", new String[]{"", "5", "7", "8", "9", "0"});
        Pins.put("9", new String[]{"", "6", "8", "9"});
        Pins.put("10", new String[]{""});


        return Pins.get(search);
    }


    public static void main(String[] args) {

        //System.out.println(Arrays.toString(HashPins("8")));
        System.out.println(getPINs("369"));

    }
}
