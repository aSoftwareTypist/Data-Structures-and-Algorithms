package _4LinkedLists.interfaces;

public interface Linear<D> {

    // Returns the number of elements in the list.
    public int size();

    // Returns true if the list is empty, and false otherwise.
    public boolean isEmpty();

    // Displays the elements in the list
    public void displayList();

    // Returns (but does not remove) the first element in the list.
    public D getfrontNodeElement();

    // Returns (but does not remove) the nth element in the list.
    public D getNthNodeElement(int n);

    // Returns (but does not remove) the last element in the list.
    public D getEndNodeElement();

    // Adds a new element to the front of the list.
    public void addFrontNode(D data);

    // adds a new element to the nth node element of the list
    public void addNthNode(int index, D data);

    // Adds a new element to the end of the list.
    public void addEndNode(D data);

    // Removes and returns the first element of the list.
    public D removeFrontNode();

    // remove and returns the nth node element of the list
    public D removeNthNode(int n);

    // Removes and returns the last element of the list.
    public D removeEndNode();
}
