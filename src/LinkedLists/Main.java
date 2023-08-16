package LinkedLists;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(78);
        list.insertFirst(6);
        list.insertFirst(37);
        list.display();
        list.insertLast(43);
        list.display();
//        list.insert(99, 4);
        list.display();
//        list.deleteFirst();
        list.display();

    }
}
