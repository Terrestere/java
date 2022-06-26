package HabrTasks.habr3;

public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 20; i++) {
            boolean Prime = true;
            for (int j = 2; j < i;j++) {
                if ((i % j) == 0) {
                    Prime = false;
                    break;
                }
            }
            if(Prime){
            System.out.print(i + ", ");
            }
        }
    }
}
