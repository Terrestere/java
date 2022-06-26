package Stack;

public class Main {
    public static void main(String[] args) {
        testQueue();
        System.out.println("\n");
        testStack();
    }

    private static void testQueue() {
        MainQueue<Integer> queue = new MainQueue<Integer>();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            queue.add(i);
        }

        System.out.println("\n");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    private static void testStack() {
        MainStack<Integer> stack = new MainStack<Integer>();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            stack.push(i);
        }

        System.out.println("\n");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
