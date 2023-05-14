package codewars;

public class Isograms {
    public static boolean isIsogram(String str) {
        String strlow = str.toLowerCase();
        for (int i = 0; i < strlow.length(); i++) {
            for (int j = i + 1; j <= strlow.length(); j++) {
                if (strlow.charAt(i) == strlow.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
