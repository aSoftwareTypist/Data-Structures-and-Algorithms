package datastructure.interfaces.adts;

public interface QueueADT<D> {

    int size();

    boolean isEmpty();

    void clear();

    D front();

    void enqueue(D element);

    D dequeue();
}
