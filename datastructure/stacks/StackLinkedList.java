package datastructure.stacks;

import datastructure.abstracts.LinkedList;
import datastructure.abstracts.Stack;
import datastructure.linkedlists.Singly;

public class StackLinkedList<D> extends Stack<D> {

    protected LinkedList<D> stack;

    public StackLinkedList() {
        stack = new Singly<D>();
    }

    public void push(D ele) {
        stack.addFrontNode(ele);
        top++;
    }

    public D peek() {
        return stack.getFrontNodeElement();
    };

    public D pop() {
        top--;
        return stack.removeFrontNode();
    }
}
