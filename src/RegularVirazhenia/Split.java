package RegularVirazhenia;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Split {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+\\s?");
        String[] words = pattern.split("java5tiger 77 java6mustang");
        String str = "java5tiger 77 java6mustang";
        String[] stt = str.split("\\d+\\s?");
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(stt));
    }
}
