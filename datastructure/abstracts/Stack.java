package datastructure.abstracts;

import datastructure.interfaces.adts.StackADT;

public abstract class Stack<D> implements StackADT<D> {
    protected int top;

    protected Stack() {
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void clear() {
        while (!isEmpty())
            pop();
    }
}
