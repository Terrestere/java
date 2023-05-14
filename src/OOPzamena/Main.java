package OOPzamena;

public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("object-oriented programming " +
                "is a programming language model organized around objects rather " +
                "than \"actions\" and data rather than logic. Object-oriented programming " +
                "blabla. Object-oriented programming bla.");
        String Old = "object-oriented programming";
        String New = "OOP";
        StringBuilder stringBuilder = stringBuilderreplace(str, Old, New);

        System.out.println(stringBuilder);

        center("String");
    }

    private static StringBuilder stringBuilderreplace(StringBuilder str, String Old, String New) {
        int pos;
        int n = Old.length();
        int count = 1;
        int start = 0;
        String str2 = str.toString().toLowerCase();
        String Old1 = Old.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();

        while ((pos = str2.indexOf(Old1, start)) != -1) {
            if (count%2==0) {
                str.replace(pos, pos+n, New);
            }
            start = pos + n;
            count++;
        }
        return str;
    }

    private static String center(String str) {
        int pos = str.length()/2;
        String s = str.substring(pos-1, pos+1);
        System.out.println(s);
        return s;
    }
}
