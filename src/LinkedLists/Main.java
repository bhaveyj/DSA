package LinkedLists;

public class Main {
    public static void main(String[] args) {
        // Singly Linked List
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(78);
        list.insertFirst(6);
        list.insertFirst(37);
        list.display();
        list.insertLast(43);
        list.display();
        list.insert(99, 4);
        list.display();
        list.deleteFirst();
        list.display();

        // Doubly Linked List
        DLL list1 = new DLL();
        list1.insertFirst(2);
        list1.insertFirst(3);
        list1.insertFirst(4);
        list1.insertFirst(5);
        list1.insertFirst(6);
        list1.display();
        list1.insertLast(34);
        list1.display();
    }
}
