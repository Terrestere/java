package Students;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        forma("ivan", 5, "Math");
        forma("Pivan", 3, "Phys");
        forma("Sivan", 2, "Chem");

    }

    private static void forma(String str, int mark, String subject) {
        Formatter formatter = new Formatter();
        formatter.format("Студент %-15s получил %-3s по %-10s", str, mark, subject);
        System.out.println(formatter);
        System.out.printf("Студент %-15s получил %-3s по %-10s", str, mark, subject);
        System.out.format("Студент %-15s получил %-3s по %-10s", str, mark, subject);
        String s = String.format("Студент %-15s получил %-3s по %-10s", str, mark, subject);
        System.out.println(s);
    }
}
