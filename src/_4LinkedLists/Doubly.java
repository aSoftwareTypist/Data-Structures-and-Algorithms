package _4LinkedLists;

public class Doubly<D> extends LinkedList<D> {

    public Doubly() {}
    public Doubly(D data) {
        length = 1;

        headNode = tailNode = new Node<D>(data);
    }

    @Override
    public void addFrontNode(D data) {
        Node<D> newNode = new Node<D>(data);

        if (isEmpty())
            tailNode = newNode;

        else {
            headNode.setPrevNode(newNode);
            newNode.setNextNode(headNode);
        }

        headNode = newNode;

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

        Node<D> newNode = new Node<D>(data), loopNode = headNode, tempNode;

        for (int i = 0; i < index - 1; i++)
            loopNode = loopNode.getNextNode();

        tempNode = loopNode.getNextNode();
        loopNode.setNextNode(newNode);
        tempNode.setPrevNode(newNode);
        newNode.setNextNode(tempNode);
        newNode.setNextNode(loopNode);

        length++;
    }

    @Override
    public void addEndNode(D data) {
        Node<D> newNode = new Node<D>(data);

        if (isEmpty())
            headNode = newNode;

        else {
            tailNode.setNextNode(newNode);
            newNode.setPrevNode(tailNode);
        }

        tailNode = newNode;

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
            headNode.setPrevNode(null);
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

        Node<D> loopNode = headNode, tempNode, rightNode;

        for (int i = 0; i < index - 1; i++)
            loopNode = loopNode.getNextNode();

        tempNode = loopNode.getNextNode();
        rightNode = tempNode.getNextNode();

        loopNode.setNextNode(rightNode);
        rightNode.setPrevNode(loopNode);

        tempNode.setNextNode(null);
        tempNode.setPrevNode(null);

        return tempNode.getElement();
    }

    @Override
    public D removeEndNode() {
        if (isEmpty())
            throw new IndexOutOfBoundsException("the list is empty");

        Node<D> tempNode = tailNode;

        if (length == 1)
            headNode = tailNode = null;

        else {
            tailNode = tailNode.getPrevNode();
            tailNode.setNextNode(null);
            tempNode.setPrevNode(null);
        }

        length--;

        return tempNode.getElement();
    }

}
