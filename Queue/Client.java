package Queue;

public class Client {
    public static void main(String[] args) throws Exception{
        Queue q = new Queue(5);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.display();
        // q.enqueue(10);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.display();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.display();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
