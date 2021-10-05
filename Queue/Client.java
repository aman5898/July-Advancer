package Queue;

public class Client {
    public static void main(String[] args) throws Exception{
        // Queue q = new Queue();
        // q.enqueue(5);
        // q.enqueue(6);
        // q.enqueue(7);
        // q.enqueue(8);
        // q.enqueue(9);
        // q.display();
        // q.dequeue();
        // q.dequeue();
        // q.enqueue(15);
        // q.display();
        // q.enqueue(10);
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // q.display();
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // q.display();
        // System.out.println(q.dequeue());
        // // System.out.println(q.dequeue());
        DynamicQueue dq = new DynamicQueue();
        dq.enqueue(10);
        dq.enqueue(20);
        dq.enqueue(30);
        dq.enqueue(40);
        dq.enqueue(50);
        dq.display();
        dq.enqueue(60);
        dq.display();
    }
}
