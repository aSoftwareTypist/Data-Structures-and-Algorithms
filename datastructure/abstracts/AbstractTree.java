package datastructure.abstracts;

import datastructure.interfaces.adts.TreeADT;

public class AbstractTree<E> implements TreeADT<E> {

    public boolean isInternal(Node<E> p) {
        return numChildren(p) > 0;
    }

    public boolean isExternal(Node<E> p) {
        return numChildren(p) == 0;
    }

    public boolean isRoot(Node<E> p) {
        return p == root();
    }

    public boolean isEmpty(Node<E> p) {
        return size() == 0;
    }
}
