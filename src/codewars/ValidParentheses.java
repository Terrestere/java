package codewars;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(Solution.validParentheses("())()("));;
        System.out.println(Solution.validParentheses("(())"));;
        System.out.println(Solution.validParentheses(")"));;
        System.out.println(Solution.validParentheses(")(o)PjKqCL"));;
    }


    public static class Solution {

        public static boolean validParentheses(String parens) {
            int count = 0;
            int count1 = 0;

            String[] splitstr = parens.split("");

            for (int i = 0; i < parens.length(); i++) {
                if (splitstr[i].equals("(")) {
                    count++;
                } else if (count > 0 && splitstr[i].equals(")")) {
                    count--;
                } else if (splitstr[i].equals(")")) {
                    count1++;
                }
                if (count1 > 0) {
                    return false;
                }
            }
            return count == 0;
        }

    }
}