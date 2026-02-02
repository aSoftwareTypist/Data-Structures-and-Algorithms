package datastructure.abstracts;

import datastructure.interfaces.adts.QueueADT;

public abstract class Queue<D> implements QueueADT<D> {

    protected int front;
    protected int size;

    public Queue() {
        front = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    

    public void clear() {
        while (!isEmpty())
            dequeue();
    }

}