package codewars;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatin {
    public static String pigIt(String str) {
        System.out.println(str);
        String[] strings1 = str.split(" ");
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        StringBuilder end = new StringBuilder();
        int count = 0;
        for (String s : strings1) {
            count++;
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                end.append(s.substring(1, s.length())).append(s.charAt(0)).append("ay");
            } else {
                end.append(s);
            }
            if (count != strings1.length) {
                end.append(" ");
            }
        }

        return end.toString();
    }

    /*public static void main(String[] args) {
        String str = "Pig latin is cool";
        String str1 = "Hello world !";
        System.out.println(PigLatin.pigIt(str));
        System.out.println(PigLatin.pigIt(str1));
    }*/
}
