package codewars;

public class RemoveTheParentheses {
    public static String removeParentheses(final String str) {
        String sol = "";
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
            } else if (str.charAt(i) == ')') {
                count1++;
            } else if (count == count1) {
                sol += str.charAt(i);
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        System.out.println(removeParentheses("example (unwanted thing) example"));
    }
}
