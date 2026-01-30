package _4LinkedLists;
// import _4LinkedLists.LinkedList;

import abstracts.LinkedList;

public class Singly<D> extends LinkedList<D> {

    public Singly() {
    }

    public Singly(D data) {
        length = 1;

        headNode = tailNode = new Node<D>(data);
    }

    @Override
    public void addFrontNode(D data) {
        Node<D> tempNode = new Node<D>(data);

        if (isEmpty())
            tailNode = tempNode;
        else
            tempNode.setNextNode(headNode);

        headNode = tempNode;

        length++;
    }

    @Override
    public void addNthNode(int index, D data) {

        if (index < 0 || index > length)
            throw new IndexOutOfBoundsException("the given position does not exist in the list");

        if (index == 0) {
            addFrontNode(data);
            return;
        } else if (index == length) {
            addEndNode(data);
            return;
        }

        Node<D> tempNode = new Node<D>(data);

        Node<D> loopNode = headNode;
        for (int i = 0; i < index - 1; i++)
            loopNode = loopNode.getNextNode();

        tempNode.setNextNode(loopNode.getNextNode());
        loopNode.setNextNode(tempNode);

        length++;
    }

    @Override
    public void addEndNode(D data) {
        Node<D> tempNode = new Node<D>(data);

        if (isEmpty())
            headNode = tempNode;
        else
            tailNode.setNextNode(tempNode);

        tailNode = tempNode;

        length++;
    }

    @Override
    public D removeFrontNode() {
        if (isEmpty())
            throw new IndexOutOfBoundsException("the list is empty");

        Node<D> tempNode = headNode;

        if (length == 1)
            headNode = tailNode = null;

        else {
            headNode = headNode.getNextNode();
            tempNode.setNextNode(null);
        }

        length--;

        return tempNode.getElement();
    }

    @Override
    public D removeNthNode(int index) {
        if (isEmpty())
            throw new IndexOutOfBoundsException("the list is empty");

        if (index < 0 || index >= length)
            throw new IndexOutOfBoundsException("the given index does not exist in the list");

        if (index == 0)
            return removeFrontNode();
        else if (index == length - 1)
            return removeEndNode();

        Node<D> tempNode, loopNode = headNode;

        for (int i = 0; i < index - 1; i++)
            loopNode = loopNode.getNextNode();

        tempNode = loopNode.getNextNode();
        loopNode.setNextNode(tempNode.getNextNode());
        tempNode.setNextNode(null);

        length--;

        return tempNode.getElement();
    }

    @Override
    public D removeEndNode() {
        if (isEmpty())
            throw new IndexOutOfBoundsException("the list is empty");

        Node<D> tempNode = headNode;

        if (length == 1)
            headNode = tailNode = null;

        else {
            for (int i = 0; i < length - 2; i++) {
                tempNode = tempNode.getNextNode();
            }

            tailNode = tempNode;
            tempNode = tailNode.getNextNode();
            tailNode.setNextNode(null);
        }

        length--;

        return tempNode.getElement();
    }

}
