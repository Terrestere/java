package codewars;

public class DisemvowelTrolls {
    public static String disemvolwel(String str) {

        String[] vowels = {"a", "e", "i", "o", "A", "E", "I", "O"};
        for (int j = 0; j < vowels.length; j++) {
            str = str.replaceAll(vowels[j], "");
        }
        return str.replaceAll("[aAeEiIoOuU]", "");
    }

    public static void main(String[] args) {
        System.out.println(DisemvowelTrolls.disemvolwel("This website is for losers LOL!"));
        String str = "This website is for losers LOL!";
        //  String strr = str.replaceAll("a", "");
    }
}
