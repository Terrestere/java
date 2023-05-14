package codewars;

public class CatsAndShelves {
    public static int solution(int start, int finish) {
        double floor = finish - start;
        int count = (int) (floor / 3);
        if (floor % 3 == 0) {
            return count;
        } else {
            int result = count*3;
            do {
                count++;
                result += 1;
            }
            while (result != floor);
        }
        return count;
    }

    public static void main(String[] args) {
        int i = solution(1, 6);
        System.out.println(i);
    }
}
