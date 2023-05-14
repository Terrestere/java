package asss;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String strpattern = "\\b([a-zA-Z]+)\\b";
        String str = "One two three раз два три one1 two2 123";
        Pattern pattern = Pattern.compile(strpattern);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }


    }
}
