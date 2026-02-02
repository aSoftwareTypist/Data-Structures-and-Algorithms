package datastructure.interfaces.adts;

public interface QueueADT<D> {

    int size();

    boolean isEmpty();

    boolean isFull();

    D getFront();

    D getRear();

    D dequeue();

    void enqueue(D element);

    void display();

    void clear();
}
