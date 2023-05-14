package codewars;

public class BetweenExtremes {
    public static int betweenExtremes(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] i = {21, 34, 54, 43, 26, 12};
        System.out.println(betweenExtremes(i));
    }
}
