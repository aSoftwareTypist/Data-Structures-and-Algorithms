package datastructure.queue.array;

import datastructure.abstracts.Queue;
import datastructure.arrays.Array;

public class CircularQueue<D> extends Queue<D> {

    protected Array<D> queue;
    protected int capacity;

    public CircularQueue(int capacity) {
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
        int rear = (front + size - 1) % capacity;
        return queue.get(rear);
    }

    public D dequeue() {
        checkEmpty();

        D temp = queue.get(front);
        queue.set(front, null);

        size--;

        front = (front + 1) % capacity;
        if (isEmpty())
            front = -1;

        return temp;
    }

    public void enqueue(D data) {
        if (isFull())
            throw new RuntimeException("queue overflown");

        if (isEmpty())
            front++;
        int rear = (front + size - 1) % capacity;
        queue.insert(rear, data);
        size++;
    }

    public void display() {
        checkEmpty();

        System.out.println("Queue (size: " + size + ") : ");
        int i = front;
        for (; i != (front + size - 1) % capacity; i = (i + 1) % capacity)
            System.out.print(queue.get(i) + "\t");

        if (i == (front + size - 1) % capacity)
            System.out.print(queue.get(i));
        System.out.println();
    }

}