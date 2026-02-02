package datastructure.queue.array;

import datastructure.abstracts.Queue;
import datastructure.arrays.Array;

public class LinearQueue<D> extends Queue<D> {

    protected Array<D> queue;
    protected int capacity;

    public LinearQueue(int capacity) {
        this.capacity = capacity;
        queue = new Array<D>(capacity);
    }


    public boolean isFull() {
        return size == capacity;
    }

    public D front() {
        if (isEmpty())
            throw new RuntimeException("queue underflown");
        return queue.get(front);
    }

    public void enqueue(D element) {
        if (isFull())
            throw new RuntimeException("queue overflown");

        if (isEmpty())
            front++;
        queue.insert(size, element);
        size++;
    }

    public D dequeue() {
        if (isEmpty())
            throw new RuntimeException("queue underflow");

        D temp = queue.get(front);
        queue.set(front, null);

        front++;
        size--;
        return temp;
    }
}
