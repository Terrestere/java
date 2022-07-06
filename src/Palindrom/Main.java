package Palindrom;

public class Main {
    public static void main(String[] args) {
        System.out.println(Palindrom("cooc"));
        System.out.println(new StringBuilder("soss").reverse().toString());
        StringBuilder stringBuilder1 = new StringBuilder();
        System.out.println(stringBuilder1);

        String str = "Java";
        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println("buffer");
        strBuffer.setLength(2);
        System.out.println(strBuffer.toString());
    }

    public static Boolean Palindrom(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
