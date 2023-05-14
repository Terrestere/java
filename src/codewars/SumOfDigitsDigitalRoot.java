package codewars;

import java.util.LinkedList;

public class SumOfDigitsDigitalRoot {
    public static void main(String[] args) {
        System.out.println(DRoot.digital_root(456));

    }

    public class DRoot {
        public static int digital_root(int n) {

            /*do {
                LinkedList<Integer> stack = new LinkedList<>();
                while (n > 0) {
                    stack.push(n % 10);
                    n = n / 10;
                }
                n = 0;
                for (int i : stack) {
                    n += i;
                }
            } while (n >= 10);
            return n;*/

            while(n > 9){
                n = n/10 + n % 10;
            }
            return n;

        }
    }
}
