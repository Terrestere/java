package Censored;

public class Main {
    public static void main(String[] args) {
        String s = "Ляка бяка заваряка вупс бяка пупск вупс";
        StringBuilder stringBuilder = new StringBuilder(s);
        modifySomeString(stringBuilder, "бяка", "«[вырезано цензурой]»");
        modifySomeString(stringBuilder, "вупс", "«[вырезано цензурой 2]»");
        System.out.println(stringBuilder);

    }

    private static void modifySomeString (StringBuilder stringBuilder, String old,
                                          String newold) {
        int pos;
        while ((pos = stringBuilder.indexOf(old)) != -1) {
            int sop = old.length() + pos;
            stringBuilder.delete(pos, sop); //deleteCharAt(old) удаляет чисто один смивол
            stringBuilder.insert(pos, newold);
//            stringBuilder.replace(pos, sop, newold);
        }
    }
}
