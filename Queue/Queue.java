package Queue;

public class Queue {
    private int front;
    private int rear;
    private int size;
    private int[] data;

    public Queue(int cap){
        data = new int[cap];
    }

    public void enqueue(int value) throws Exception{
        if(size==data.length){
            throw new Exception("Queue is full");
        }        
        if(size==0){
            data[rear] = value;
        }else{
            this.rear++;
            this.rear = this.rear%this.data.length;
            this.data[this.rear] = value;
        }
        this.size++;
    }

    public int dequeue() throws Exception{
        if(size==0){
            throw new Exception("Queue is Empty");
        }       

        int temp = this.data[this.front];
        this.front++;
        this.front = this.front%this.data.length;
        this.size--;
        return temp;
        
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size==0;
    }

    public void display(){
        System.out.println();
        System.out.println("````````````````````````````````");
        for(int i=0;i<this.size;i++){
            System.out.print(this.data[(this.front+i)%this.data.length]+" ");
        }
        System.out.println();
        System.out.println("````````````````````````````````");

        for(int val:this.data){
            System.out.print(val+" ");
        }
    }


}