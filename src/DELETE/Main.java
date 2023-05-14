package DELETE;

public class Main {
    public static void main(String[] args) {
        String text = "Методы доступа называют ещё аксессорами (от англ. access — доступ)" +
                ", или по отдельности — геттерами (англ. get — чтение)" +
                " and сеттерами (англ. set — запись)";
        UniqueCharsNumberSearcher searcher = new UniqueCharsNumberSearcher();
        System.out.println("Первое слово, в котором число " +
                "различных символов минимально: \"" +
                searcher.search(text, "[\\wА-Яа-яЁё]+") + '\"');
    }
}