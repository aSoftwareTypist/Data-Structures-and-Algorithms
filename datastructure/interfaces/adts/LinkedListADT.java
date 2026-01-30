package datastructure.interfaces.adts;

public interface LinkedListADT<D> {

    // Returns the number of elements in the list
    int size();

    // Checks if the list is empty
    boolean isEmpty();

    // Displays the elements of the list
    void displayList();

    // Returns (but does not remove) the first element
    D getFrontNodeElement();

    // Returns (but does not remove) the last element
    D getEndNodeElement();

    // Returns (but does not remove) the nth element
    D getNthNodeElement(int index);

    // Adds a new element to the front of the list
    void addFrontNode(D data);

    // Adds a new element to the nth position
    void addNthNode(int index, D data);

    // Adds a new element to the end of the list
    void addEndNode(D data);

    // Removes and returns the first element
    D removeFrontNode();

    // Removes and returns the nth element
    D removeNthNode(int index);

    // Removes and returns the last element
    D removeEndNode();

    // optional: only for circular lists
    default void rotate() {
        // do nothing by default
    }
}