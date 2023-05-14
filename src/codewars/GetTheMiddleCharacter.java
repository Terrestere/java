package codewars;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        int count = word.length();
        StringBuilder result = new StringBuilder();
        if (count % 2 == 0) {
            result.append(word.charAt(count/2 - 1));
            result.append(word.charAt(count/2));
        } else if (count == 1) {
            return word;
        } else {
            result.append(word.charAt(count/2));
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String s = getMiddle("testing");
        System.out.println(s);
    }
}
