package datastructure.interfaces.adts;

public interface TreeADT<E> {

    Node<E> root();

    Node<E> parent(Node<E> p) throws IllegalArgumentException;

    Iterable<Node<E>> children(Node<E> p)
            throws IllegalArgumentException;

    int numChildren(Node<E> p) throws IllegalArgumentException;

    boolean isInternal(Node<E> p) throws IllegalArgumentException;

    boolean isExternal(Node<E> p) throws IllegalArgumentException;

    boolean isRoot(Node<E> p) throws IllegalArgumentException;

    int size();

    boolean isEmpty();

    Iterator<Node<E>> iterator();

    Iterable<Node<E>> Nodes();
}
