package StrokaStringBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = stringBuilder(3, 56);
        System.out.println(stringBuilder1);
        StringBuilder stringBuilder2 = stringBuilder(56, 3);
        System.out.println(stringBuilder2);
//        modify(stringBuilder1).append("только при наличии возвращаемого метода(not void)");
        modify(stringBuilder2);
        System.out.println(stringBuilder2);

    }

    private static StringBuilder stringBuilder(int a, int b) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a).append(" + ").append(b).append(" = ").append(a + b).
                append("\n").append(a).append(" - ").append(b).append(" = ").
                append(a - b).append("\n").append(a).append(" * ").append(b).append(" = ").
                append(a * b);

        return stringBuilder;
    }

    private static StringBuilder modify(StringBuilder stringBuilder) {
        int pos;

        while ((pos = stringBuilder.indexOf("=")) != -1) {
           /* stringBuilder.deleteCharAt(pos);
            stringBuilder.insert(pos, "равно");*/
            stringBuilder.replace(pos,pos+1,"равно");
        }
        return stringBuilder; //ругается что не используется возвращение из-за отсутствия доп метода
    }
}
