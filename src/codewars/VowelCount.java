package codewars;

public class VowelCount {
    public static int getCount(String str) {
        int count = 0;
        Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (str.charAt(i) == vowels[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = VowelCount.getCount("abracadabra");
        System.out.println(i);
    }
}
