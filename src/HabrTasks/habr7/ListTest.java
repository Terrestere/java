package HabrTasks.habr7;

public class ListTest {
    public static void main(String[] args) {
        List l = new List();
        for(int i = 0; i<=5; i++){
            l.addBack(i);
        }
        l.printList();
        l.addAfter(4, 4);
        l.printList();
        l.delEl(2);
        l.printList();
        l.addFront(11);
        l.printList();
        l.addBack(12);
        l.printList();
        l.addBack(19);
        l.printList();
        l.addFront(121);
        l.printList();
    }
}