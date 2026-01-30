package _6Stacks;

import abstracts.LinkedList;
import abstracts.Stack;

import _4LinkedLists.Singly;

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
