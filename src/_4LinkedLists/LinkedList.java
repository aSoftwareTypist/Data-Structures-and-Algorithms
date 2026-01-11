package _4LinkedLists;

import _4LinkedLists.interfaces.Linear;

public abstract class LinkedList<D> implements Linear<D> {
    protected int length;
    protected Node<D> headNode;
    protected Node<D> tailNode;

    protected static class Node<D> {
        D element;
        private Node<D> nextNode;
        private Node<D> prevNode;

        public Node(D data) {
            this.element = data;
            this.nextNode = null;
            this.prevNode = null;
        }

        public void setNextNode(Node<D> nextAddr) {
            nextNode = nextAddr;
        };

        public void setPrevNode(Node<D> prevAddr) {
            prevNode = prevAddr;
        };

        public D getElement() {
            return element;
        }

        public Node<D> getNextNode() {
            return nextNode;
        };

        public Node<D> getPrevNode() {
            return prevNode;
        };

    }

    // Returns the number of elements in the list.
    public int size() {
        return length;
    }

    // Returns true if the list is empty, and false otherwise.
    public boolean isEmpty() {
        return length <= 0;
    }

    // Displays the elements in the list
    public void displayList() {

        System.out.println("\nThe size of list is: " + size());
        if (isEmpty()) {
            System.out.println("The list is empty");
            return;
        }

        Node<D> tempNode = headNode;

        System.out.print("Elements in list: ");

        for (int i = 0; i <= length - 1; i++) {
            System.out.print(tempNode.getElement());
            if (tempNode != tailNode)
                System.out.print(" -> ");
            tempNode = tempNode.getNextNode();

        }

        System.out.println();
    }

    // Returns (but does not remove) the first element in the list.
    public D getfrontNodeElement() {
        if (isEmpty())
            throw new IndexOutOfBoundsException("the list is empty");

        return headNode.getElement();
    };

    // Returns (but does not remove) the nth element in the list.
    public D getNthNodeElement(int index) {
        if (isEmpty())
            throw new IndexOutOfBoundsException("the list is empty");

        if (index < 0 || index > length)
            throw new IndexOutOfBoundsException("the given position does not exist in the list");

        if (index == 0)
            return getfrontNodeElement();
        else if (index == length - 1)
            return getEndNodeElement();

        Node<D> loopNode = headNode, tempNode;

        for (int i = 0; i < index - 1; i++)
            loopNode = loopNode.getNextNode();

        tempNode = loopNode.getNextNode();

        return tempNode.getElement();
    }

    // Returns (but does not remove) the last element in the list.
    public D getEndNodeElement() {
        if (isEmpty())
            throw new IndexOutOfBoundsException("the list is empty");
            
        return tailNode.getElement();
    };

    public void rotate() {
    };
}
