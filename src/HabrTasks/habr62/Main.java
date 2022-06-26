package HabrTasks.habr62;

public class Main {
    public static void main(String[] args) {

    class RandomFromArray {
        private int[] values;
        private int[] weights;
        private int[] ranges;
        private int sum;

        public RandomFromArray(int[] values, int[] weights) {
            this.values = values;
            this.weights = weights;
            ranges = new int[values.length];

            sum = 0;
            for (int weight : weights) {
                sum += weight;
            }

            int lastSum = 0;
            for (int i = 0; i < ranges.length; i++) {
             ranges[i] = lastSum;
                lastSum += weights[i];
            }
        }

        public int getRandom() {
            int random = (int) (Math.random() * (sum - 1));

            int ourRangeIndex = 0;
            for (int i = 0; i < ranges.length; i++) {
                if (ranges[i] > random) {
                    break;
                }
                ourRangeIndex = i;
            }
            return values[ourRangeIndex];
            }
        }

        int[] v = {1, 2, 3};
        int[] w = {1, 2, 10};
        RandomFromArray randomFromArray = new RandomFromArray(v, w);
        randomFromArray.getRandom();
        System.out.println(randomFromArray.getRandom());
    }
}

