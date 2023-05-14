package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MillipedeOfWords {
    //desirE EndurE ExcavatE ExcesS ScreeN NighT Theater
    public static boolean check(String[] millipede) {
        ArrayList<String> arr = new ArrayList<>(List.of(millipede));
        ArrayList<String> sol = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                if (i != j && arr.get(i).charAt(arr.get(i).length() - 1) == arr.get(j).charAt(0)) {
                    String a = arr.get(j);
                    arr.remove(j);
                    arr.add(i + 1, a);
                    break;
                } else if (i == j) {
                    continue;
                } else if (j == arr.size()-1) {
                    String b = arr.get(count);
                    arr.remove();
                    arr.add();
                    count++;
                }
            }
        }
        System.out.println(sol);
        return true;
    }

    public static void main(String[] args) {
        String[] message = new String[]{"excavate", "endure", "desire", "screen", "theater", "excess", "night"};
        System.out.println(check(message));
    }
}
