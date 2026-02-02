package datastructure.queue.linkedlist;

import datastructure.abstracts.LinkedList;
import datastructure.abstracts.Queue;
import datastructure.linkedlists.Doubly;

public class LinearQueue<D> extends Queue<D> {

    protected LinkedList<D> queue;

    public LinearQueue() {
        queue = new Doubly<D>();
        size = queue.length;
    }

    public boolean isFull() {
        return false;
    }

    public D getFront() {
        checkEmpty();
        return queue.getFrontNodeElement();
    }

    public D getRear() {
        checkEmpty();
        return queue.getEndNodeElement();
    }

    public D dequeue() {
        checkEmpty();
        size--;
        return queue.removeFrontNode();
    }

    public void enqueue(D data) {
        size++;
        queue.addEndNode(data);
    }

    public void display() {
        checkEmpty();
        System.out.println("Queue (size: " + size + ") : ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue.getNthNodeElement(i) + "\t");
        }
        System.out.println();
    }
}
