package _6Stacks;

import _3Arrays.Array;
import abstracts.Stack;

public class StackArray<D> extends Stack<D> {
    private Array<D> stack;
    private int capacity;

    public StackArray(int cap) {
        super();
        capacity = cap;
        stack = new Array<D>(cap);
    }

    public void push(D ele) {
        if (top + 1 == capacity)
            throw new RuntimeException("stack overflow");

        stack.insert(++top, ele);
    }

    public D peek() {
        if (isEmpty()) {
            throw new RuntimeException("stack underflow");
        }
        return stack.get(top);
    }

    public D pop() {
        if (isEmpty())
            throw new RuntimeException("stack underflow");

        D temp = stack.get(top);

        stack.set(top, null);
        top--;
        return temp;
    }
}
