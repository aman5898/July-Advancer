package LinkedList;
public class LinkedList {

    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    // constructor
    // No return Type
    // Invoked as soon as object is created
    // Named same as class
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addLast(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (size == 0) {
            this.head = node;
        } else {
            this.tail.next = node;
        }
        this.tail = node;
        this.size++;
    }

    public void addFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (size == 0) {
            this.head = node;
            this.tail = node;
        }
        {
            node.next = head;
            this.head = node;
        }
        this.size++;
    }

    public void display(){
        System.out.println("```````````````````````````````````````````");
        Node node = this.head;
        while(node!=null){
            System.out.print(node.data+"->");
            node = node.next;
        }
        System.out.println();

        System.out.println("```````````````````````````````````````````");
    }

}
