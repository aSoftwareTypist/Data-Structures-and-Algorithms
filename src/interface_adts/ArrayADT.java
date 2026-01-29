package interface_adts;

// ArrayADT.java
public interface ArrayADT<D> {

    // Get the element at a given index
    D get(int index);

    // Set the element at a given index
    void set(int index, D value);

    // Return the number of elements in the array
    int size();

    // Check if the array is empty
    boolean isEmpty();

    // Search for an element and return its index, -1 if not found
    int indexOf(D value);

    // Insert an element at a given index (shifts elements to the right)
    void insert(int index, D value);

    // Delete an element at a given index (shifts elements to the left)
    D remove(int index);

    // Optional: display all elements
    void display();
}
