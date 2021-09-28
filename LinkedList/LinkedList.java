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

    public void display() {
        System.out.println("```````````````````````````````````````````");
        Node node = this.head;
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println();

        System.out.println("```````````````````````````````````````````");
    }

    // public void addAt(int idx,int data){

    // }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public int getFirst() {
        if (this.size == 0) {
            return -1;
        } else {
            return this.head.data;
        }
    }

    public int getLast() {
        if (this.size == 0) {
            return -1;
        } else {
            return this.tail.data;
        }
    }

    public int getAt(int idx) {
        if (idx < 0 || idx >= this.size) {
            return -1;
        }
        Node node = this.head;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }

        return node.data;
    }

    public Node getNodeAt(int idx) {
        if (idx < 0 || idx >= this.size) {
            return null;
        }
        Node node = this.head;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }

        return node;
    }

    public int removeFirst() {
        if (size == 0) {
            return -1;
        } else if (size == 1) {
            int temp = this.head.data;
            this.head = null;
            this.tail = null;
            this.size = 0;
            return temp;
        } else {
            int temp = this.head.data;
            this.head = this.head.next;
            this.size--;
            return temp;
        }
    }

    public int removeLast() {
        if (size == 0) {
            return -1;
        } else if (size == 1) {
            int temp = this.tail.data;
            this.head = null;
            this.tail = null;
            this.size = 0;
            return temp;
        } else {
            int temp = this.tail.data;
            Node slNode = getNodeAt(this.size - 2);
            slNode.next = null;
            this.tail = slNode;
            this.size--;
            return temp;
        }
    }

    public int removeAt(int idx) {
        if (idx == 0) {
            return removeFirst();
        } else if (idx == this.size - 1) {
            return removeLast();
        } else {

            Node removePredNode = getNodeAt(idx - 1);
            int temp = removePredNode.next.data;
            removePredNode.next = removePredNode.next.next;
            this.size--;
            return temp;
        }
    }

    public void reverseDI(){
        int l=0;
        int r=this.size-1;
        while(l<r){
            Node lNode = getNodeAt(l);
            Node rNode = getNodeAt(r);
            int temp = lNode.data;
            lNode.data = rNode.data;
            rNode.data = temp;
            l++;
            r--;
        }
    }

}
