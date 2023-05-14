package codewars;

import java.util.ArrayList;
import java.util.HashMap;

public class DecodeTheMorseCode {
    public static String decode(String morseCode) {
        System.out.println(morseCode);
        HashMap<String, String> CodeMorse = new HashMap<>();
        CodeMorse.put(".-", "A");
        CodeMorse.put("-...", "B");
        CodeMorse.put("-.-.", "C");
        CodeMorse.put("-..", "D");
        CodeMorse.put(".", "E");
        CodeMorse.put("..-.", "F");
        CodeMorse.put("--.", "G");
        CodeMorse.put("....", "H");
        CodeMorse.put("..", "I");
        CodeMorse.put(".---", "J");
        CodeMorse.put("-.-", "K");
        CodeMorse.put(".-..", "L");
        CodeMorse.put("--", "M");
        CodeMorse.put("-.", "N");
        CodeMorse.put("---", "O");
        CodeMorse.put(".--.", "P");
        CodeMorse.put("--.-", "Q");
        CodeMorse.put(".-.", "R");
        CodeMorse.put("...", "S");
        CodeMorse.put("-", "T");
        CodeMorse.put("..-", "U");
        CodeMorse.put("...-", "V");
        CodeMorse.put(".--", "W");
        CodeMorse.put("-..-", "X");
        CodeMorse.put("-.--", "Y");
        CodeMorse.put("--..", "Z");
        CodeMorse.put(".----", "1");
        CodeMorse.put("..---", "2");
        CodeMorse.put("...--", "3");
        CodeMorse.put("....-", "4");
        CodeMorse.put(".....", "5");
        CodeMorse.put("-....", "6");
        CodeMorse.put("--...", "7");
        CodeMorse.put("---..", "8");
        CodeMorse.put("----.", "9");
        CodeMorse.put("-----", "0");
        CodeMorse.put("...---...", "SOS");
        CodeMorse.put(".-.-.-", ".");
        CodeMorse.put("--..--", ",");
        CodeMorse.put("-..-.", "/");
        CodeMorse.put("..--..", "?");
        CodeMorse.put("-.-.--", "!");
        CodeMorse.put("", "");
        String[] Split = morseCode.split("   ");
        StringBuilder result = new StringBuilder();
        if (Split.length != 1) {
            for (int j = 0; j < Split.length; j++) {
                if (Split[0].equals("") && Split[j].equals(Split[0])) {
                    continue;
                }
                String[] strings = Split[j].split(" ");
                for (int i = 0; i < strings.length; i++) {
                    result.append(CodeMorse.get(strings[i]));
                }
                if (j != Split.length-1) {
                    result.append(" ");
                }
            }
        } else {
            String[] strings = morseCode.split(" ");
            for (int i = 0; i < strings.length; i++) {
                result.append(CodeMorse.get(strings[i]));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // String str = decode(".... . -.--   .--- ..- -.. .");
        //String str1 = decode(" . ");
        //String str2 = decode("   .   . ");
        String str3 = decode(".   .");
        System.out.println(str3);
    }

}
