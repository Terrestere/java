package third.interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        outputinfo(animal1);
        outputinfo(person1);

    }

    public static void outputinfo(Info info) {
        info.showInfo();
    }
}
