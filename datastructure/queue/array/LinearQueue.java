package datastructure.queue.array;

import datastructure.abstracts.Queue;
import datastructure.arrays.Array;

public class LinearQueue<D> extends Queue<D> {

    private Array<D> queue;
    private int capacity;

    public LinearQueue(int capacity) {
        this.capacity = capacity;
        queue = new Array<D>(capacity);
    }

    public boolean isFull() {
        return size == capacity;
    }

    public D getFront() {
        checkEmpty();
        return queue.get(front);
    }

    public D getRear() {
        checkEmpty();
        return queue.get(front + size - 1);
    }

    public D dequeue() {
        checkEmpty();

        D temp = queue.get(front);
        queue.set(front, null);

        size--;
        front++;
        if (isEmpty())
            front = -1;
        return temp;
    }

    public void enqueue(D element) {
        if (isFull())
            throw new RuntimeException("queue overflown");

        if (isEmpty())
            front++;
        queue.set(front + size, element);
        size++;
    }

    public void display() {
        checkEmpty();

        System.out.println("Queue (size: " + size + ") : ");
        for (int i = front; i < front + size; i++)
            System.out.print(queue.get(i));
    }
}
