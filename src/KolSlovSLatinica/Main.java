package KolSlovSLatinica;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "One two three раз два три one1 two2 123";
        String pat = "\\b([a-zA-Z]+)\\b";
        System.out.println("Count: " + Search(str, pat));

    }

    public static int Search(String str, String pat) {
        int count = 0;
        String patt = "\\s+";
        Pattern pattern = Pattern.compile(patt);

        /*можно да и нужно делать без сплита

        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            count++;
            System.out.println(matcher.group());
            }
        */

        String[] matcher = pattern.split(str);
        System.out.println(Arrays.toString(matcher));
        for (String matcher1 : matcher) {
            Pattern pattern1 = Pattern.compile(pat);
            Matcher matcher2 = pattern1.matcher(matcher1);
            if (matcher2.find()) {
                count++;
            }

        }
        return count;
    }
}
