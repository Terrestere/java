package HabrTasks.habr5;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int x, y, z;
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        Vector vek = new Vector(x, y, z);*/

        Vector[] vectors = Vector.generate(10);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].length());
        System.out.println(vectors[0].scalarProduct(vectors[1]));
        System.out.println(vectors[0].crossProduct(vectors[1]));
        System.out.println(vectors[0].cos(vectors[1]));
        System.out.println(vectors[0].summ(vectors[1]));
        System.out.println(vectors[0].diff(vectors[1]));
    }


}


