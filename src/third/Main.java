package third;


public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human("Bob", 30);
        h2.setName("Tom");
        h2.getInfo();

    }
}

class Human {
    private String name;
    private int age;

    public Human() {System.out.println("privy");}
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName (String name) { this.name = name;}

    public String getName() {return name;}

    public void setAge(int age) {this.age = age;}

    public int getAge() {return age;}

    public void getInfo() {System.out.println(name + age);}
}
