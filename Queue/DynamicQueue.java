package Queue;

public class DynamicQueue extends Queue {
    @Override
    public void enqueue(int value) throws Exception {
        if (this.size == this.data.length) {
            // System.out.println("Array Is being increased");
            int[] oa = this.data;
            this.data = new int[2 * oa.length];
            for (int i = 0; i < this.size; i++) {
                data[i] = oa[(this.front + i) % oa.length];
            }
            this.front = 0;
            this.rear = this.front + this.size - 1;
        }

        super.enqueue(value);
    }
}
