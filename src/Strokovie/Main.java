package Strokovie;

public class Main {
    public static void main(String[] args) {
        String s = "I like Java!!!";
        System.out.println(Stroka(s));
        System.out.println(Stroka1(s));
        System.out.println(Stroka2(s));
        System.out.println(Stroka3(s));
        System.out.println(Stroka4(s));
        System.out.println(Stroka5(s));
        System.out.println(Stroka6(s));
        System.out.println(Stroka7(s));
        System.out.println(Stroka8(s, "Java"));

        ALL("I like Java!!!");


    }

    public static String Stroka(String s) {
        return String.valueOf(s.charAt(s.length()-1));

    }

    public static boolean Stroka1(String s) {
        return s.endsWith("!!!");
    }

    public static boolean Stroka2(String s) {
        return s.startsWith("i like");
    }

    public static boolean Stroka3(String s) {
        return s.contains("Java");
    }

    public static int Stroka4(String s) {
        return s.indexOf("Java");
    }

    public static String Stroka5(String s) {
        return s.replace("a", "o");
    }

    public static String Stroka6(String s) {
        return s.toUpperCase();
    }

    public static String Stroka7(String s) {
        return s.toLowerCase();
    }

    public static String Stroka8 (String s, String v) {
        return s.substring(s.indexOf(v), s.indexOf(v) + v.length());
    }

    public static void ALL (String str) {
        System.out.println(str);
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a","o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(str.indexOf("Java"), str.indexOf("Java")
                + 4));
    }


}
