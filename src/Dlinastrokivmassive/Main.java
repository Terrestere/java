package Dlinastrokivmassive;

import java.util.ArrayList;

public class Main {
    private int s;

    public static void main(String[] args) {
        String[] s =  {"one", "two", "Three","Seven"};
/*        for (String value : s) {
            System.out.println(value);
        }*/
       // System.out.println(s.length);
       // System.out.println(s[2].length());
        for (String value : Dlinna(s)) {
            System.out.println(value);
        }
    }

    public static ArrayList<String> Dlinna(String[] strings) {
     //   int s = 0;
        ArrayList<String> word = new ArrayList<>();
        word.add("null");
        word.add("0");
    //    String word[] = new String[2];
        for (String string : strings) {
            if (string.length() > Integer.parseInt(word.get(1))) {
                word.clear();
                word.add(string);
                word.add(String.valueOf(string.length()));
            } else if (string.length() == Integer.parseInt(word.get(1))) {
                word.add(string);
                word.add(String.valueOf(string.length()));
            }
        }
        return word;
    }
}
