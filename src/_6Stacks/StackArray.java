package _6Stacks;

import interface_adts.StackADT;

public class StackArray<D> implements StackADT<D> {

    public static final int CAPACITY = 1000;

    private D[] data;

    public StackArray() {
        this(CAPACITY);
    }

    public StackArray(int cap) {
        data = (D[]) new Object[cap];
    }

    @Override
    public D pop() {
        // TODO pop method for Array Stack
        return null;
    }
}
