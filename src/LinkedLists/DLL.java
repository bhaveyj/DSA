package LinkedLists;

public class DLL {
    private Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null){
            node.prev = null;
            head = node;
            return;
        }
        while (last.next!= null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }
    public void display(){
        Node temp = head;
        Node last = null;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");
        System.out.println("Reversed List is: ");
        while (last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }
    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
