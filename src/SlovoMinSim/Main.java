package SlovoMinSim;

public class Main {
    public static void main(String[] args) {
        String text = "fffff ab 1234 111 jkjk";
        UniqueSim sim = new UniqueSim();
        System.out.println(sim.search(text, "\\w+"));
    }
}
