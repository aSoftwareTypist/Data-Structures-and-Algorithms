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
/*
∗ Returns the number of elements in the stack.
∗ @return number of elements in the stack
*/
int size( );
/*
∗ Tests whether the stack is empty.
∗ @return true if the stack is empty, false otherwise
*/
boolean isEmpty( );
/*
∗ Inserts an element at the top of the stack.
∗ @param e the element to be inserted
*/
void push(D e);
/*
∗ Returns, but does not remove, the element at the top of the stack.
∗ @return top element in the stack (or null if empty)
*/
D top( );
/*∗
∗ Removes and returns the top element from the stack.
∗ @return element removed (or null if empty)
*/
D pop( );
}

