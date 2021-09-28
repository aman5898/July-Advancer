package LinkedList;
public class Client{

public static void main(String[] args){
    LinkedList ll = new LinkedList();
    // ll.addLast(20);
    // // ll.display();
    // ll.addFirst(30);
    // // ll.display();
    // ll.addLast(40);
    // // ll.display();
    // ll.addLast(50);
    // ll.addFirst(60);
    // ll.addLast(100);

    // ll.display();
    // ll.reverseDI();
    // ll.display();
    // ll.reversePI();
    ll.addLast(10);
    ll.addLast(20);
    ll.addLast(30);
    ll.addLast(20);
    ll.addLast(10);
    ll.display();
    System.out.println(ll.isPalindrome());
}

}