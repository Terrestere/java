package Censored;

public class modifySomeString {
    static void modifySomeString(StringBuilder stringBuilder, String old,
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