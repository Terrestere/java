package codewars;

import java.math.BigInteger;

public class AddingBigNumbers {
    public static String add(String a, String b) {
        if (a.length() > b.length()) {
            String t = a;
            a = b;
            b = t;
        }

        // Take an empty String for storing result
        String str = "";

        // Calculate length of both String
        int n1 = a.length(), n2 = b.length();

        // Reverse both of Strings
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();

        int carry = 0;
        for (int i = 0; i < n1; i++) {
            // Do school mathematics, compute sum of
            // current digits and carry
            int sum = ((int) (a.charAt(i) - '0') +
                    (int) (b.charAt(i) - '0') + carry);
            str += (char) (sum % 10 + '0');

            // Calculate carry for next step
            carry = sum / 10;
        }

        // Add remaining digits of larger number
        for (int i = n1; i < n2; i++) {
            int sum = ((int) (b.charAt(i) - '0') + carry);
            str += (char) (sum % 10 + '0');
            carry = sum / 10;
        }

        // Add remaining carry
        if (carry > 0)
            str += (char) (carry + '0');

        if (str.charAt(str.length()-1) == '0') {
            str = str.substring(0, str.length() - 1);
            }

            // reverse resultant String
            str = new StringBuilder(str).reverse().toString();

        return str;
    }

    public static void main(String[] args) {
        try {

            /*String str1 = "63829983432984289347293874";
            String str2 = "90938498237058927340892374089";
            System.out.println(AddingBigNumbers.add("63829983432984289347293874", "090938498237058927340892374089"));*/

            System.out.println('9' + '0');
            System.out.println('0');
            System.out.println('9');
            System.out.println('9' - '0');

        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
