package codewars;


import java.util.ArrayList;


public class MakeTheDeadFishSwim {
    public static void main(String[] args) {
        String word = "iiisdoso";
        String[] initially = word.split("");
        DeadFish.parse(word);
    }

    public class DeadFish {
        public static int[] parse(String data) {
            ArrayList<Integer> value = new ArrayList<>();
            int num = 0;

            String[] initially = data.split("");
            label:
            for (String var : initially) {

                switch (var) {
                    case "i":
                        num++;
                        break;
                    case "d":
                        num--;
                        break;
                    case "s":
                        num *= num;
                        break;
                    case "o":
                        value.add(num);
                        break;
                    default:
                        System.out.println("Error");
                        break label;
                }
            }
            return value.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
