package interface_adts;

/*
∗ A collection of objects that are inserted and removed according to the last-in
∗ first-out principle. Although similar in purpose, this interface differs from
∗ java.util.Stack.
∗
∗ @author Michael T. Goodrich
∗ @author Roberto Tamassia
∗ @author Michael H. Goldwasser
*/
public interface StackADT<D> {

    // Adds an element to the top of the stack
    void push(D element);

    // Removes and returns the top element of the stack
    D pop();

    // Returns the top element without removing it
    D peek();

    // Checks if the stack is empty
    boolean isEmpty();

    // Returns the number of elements in the stack
    int size();

    // Removes all elements from the stack
    void clear();
}
