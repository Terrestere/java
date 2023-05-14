package codewars;

import java.sql.SQLOutput;

public class GreedIsGood {
    public static void main(String[] args) {
        for (int i = 0; i <= 6;i++) {
            int a = (int) (1 + Math.random() * 6);
            int b = (int) (1 + Math.random() * 6);
            int c = (int) (1 + Math.random() * 6);
            int d = (int) (1 + Math.random() * 6);
            int e = (int) (1 + Math.random() * 6);
            int[] diceRandom = {a, b, c, d, e};
            System.out.println(a + " " + b + " " + c + " " + d + " " + e);
            System.out.println(Greed.greedy(diceRandom));
        }
/*        int[] dice = {6, 6, 6, 6, 4};
        System.out.println(Greed.greedy(dice));*/
    }

    public class Greed {
        public static int greedy(int[] dice) {
 /*           int[] count = new int[6];
            int summpoint = 0;
            for (Integer s : dice) {
                if (s == 1) {
                    count[0]++;
                } else if (s == 2) {
                    count[1]++;
                } else if (s == 3) {
                    count[2]++;
                } else if (s == 4) {
                    count[3]++;
                } else if (s == 5) {
                    count[4]++;
                } else if (s == 6) {
                    count[5]++;
                }
            }

            for (int i = 0; i < count.length; i++) {
                if (count[i] >= 3 && i != 0 && i != 4) {
                    summpoint += (i + 1) * 100;
                } else if (count[i] < 3 && i == 4) {
                    summpoint += count[i] * 5 * 10;
                } else if (count[i] < 3 && i == 0) {
                    summpoint += count[i] * 100;
                } else if (count[i] >= 3 && i == 0) {
                    summpoint += 1000 + (count[i] - 3) * 100;
                } else if (count[i] >= 3 && i == 4) {
                    summpoint += ((i + 1) * 100) + ((count[i] - 3) * (i + 1) * 10);
                }
            }
            return summpoint;*/
            int[] n = new int[7];
            for (int d : dice) n[d]++;
            return n[1]/3*1000 + n[1]%3*100 + n[2]/3*200 + n[3]/3*300 + n[4]/3*400 + n[5]/3*500 + n[5]%3*50 + n[6]/3*600;

        }
    }
}


/*
public class GreedIsGoodSolution {

    public static int greedy(int[] dice) {
        int[] n = new int[7];

        for (int i : dice) {
            n[i]++;
        }

        return (n[1]/3)*1000 + (n[1]%3)*100 + (n[2]/3)*200 + (n[3]/3)*300 +
                (n[4]/3)*400 + (n[5]/3)*500 + (n[5]%3)*50 + (n[6]/3)*600;
    }
}*/

/*
import java.util.Arrays;

public class GreedIsGood {
    public static int greedy(int[] dice){
        int result = 0;

        int numberOf1 = howManyNumberInArray(dice, 1);
        int numberOf2 = howManyNumberInArray(dice, 2);
        int numberOf3 = howManyNumberInArray(dice, 3);
        int numberOf4 = howManyNumberInArray(dice, 4);
        int numberOf5 = howManyNumberInArray(dice, 5);
        int numberOf6 = howManyNumberInArray(dice, 6);

        if (numberOf1 < 3) {
            result += 100*numberOf1;
        } else if (numberOf1 >= 3) {
            result += 1000 + 100*(numberOf1 - 3);
        }

        if (numberOf5 < 3) {
            result += 50*numberOf5;
        } else if (numberOf5 >= 3) {
            result += 500 + 50*(numberOf5 - 3);
        }

        if (numberOf2 >= 3)
            result += 200;
        if (numberOf3 >= 3)
            result += 300;
        if (numberOf4 >= 3)
            result += 400;
        if (numberOf6 >= 3)
            result += 600;

        return result;
    }

    public static int howManyNumberInArray(int[] dice, int target) {
        return (int) Arrays.stream(dice).filter(number -> number == target).count();
    }
}*/
