package Censored;

public class Main {
    public static void main(String[] args) {
        String s = "Ляка бяка заваряка вупс бяка пупск вупс";
        StringBuilder stringBuilder = new StringBuilder(s);
        modifySomeString.modifySomeString(stringBuilder, "бяка", "«[вырезано цензурой]»");
        modifySomeString.modifySomeString(stringBuilder, "вупс", "«[вырезано цензурой 2]»");
        System.out.println(stringBuilder);

    }

}
