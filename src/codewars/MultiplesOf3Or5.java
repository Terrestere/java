package codewars;

public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(10));
    }

    public static class Solution {
        static public int solution(int number) {
            int summ = 0;

            if (number > 0) {
                for (int i = 1; i < number; i++) {
                    if (i % 3 == 0 || i % 5 == 0) {
                        summ += i;
                    }
                }
            } else {
                return 0;
            }
            return summ;
        }
    }
}
