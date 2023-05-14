package codewars;

import java.util.HashMap;

public class ComplementaryDNA {
    public static String makeComplement(String dna){
        String s = "ACTG";
        StringBuilder result = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        HashMap<Character, String> res = new HashMap<>();
        res.put('A', "T");
        res.put('T', "A");
        res.put('C', "G");
        res.put('G', "C");

        for (int j = 0; j < dna.length(); j++) {
            result2.append(res.get(dna.charAt(j)));
        }



        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == s.charAt(0)) {
                result.append(s.charAt(2));
            } else if (dna.charAt(i) == s.charAt(1)) {
                result.append(s.charAt(3));
            } else if (dna.charAt(i) == s.charAt(2)) {
                result.append(s.charAt(0));
            } else if (dna.charAt(i) == s.charAt(3)) {
                result.append(s.charAt(1));
            }
        }
        return String.valueOf(result2);
    }

    public static void main(String[] args) {
        String s = makeComplement("ATTGC");
        System.out.println(s);
    }
}
