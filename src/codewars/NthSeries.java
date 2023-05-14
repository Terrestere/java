package codewars;

public class NthSeries {

    public static String seriesSum(int n) {
        double result = 0;
        double count = 1;
        for (int i = 0; i < n; i++){
            result += 1/count;
            count += 3;
        }
        return String.format("%.2f",result);
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
}