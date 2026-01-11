package _4LinkedLists;

public class CircularDoubly<D> extends LinkedList<D> {

    public CircularDoubly() {
    }

    public CircularDoubly(D data) {
        length = 1;

        headNode = tailNode = new Node<D>(data);

        headNode.setPrevNode(tailNode);
        tailNode.setNextNode(headNode);
    }

    @Override
    public void addFrontNode(D data) {
        Node<D> tempNode = new Node<D>(data);

        if (isEmpty())
            tailNode = tempNode;

        else {
            headNode.setPrevNode(tempNode);
            tempNode.setNextNode(headNode);
        }

        headNode = tempNode;
        headNode.setPrevNode(tailNode);
        tailNode.setNextNode(headNode);

        length++;

        return;
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

        Node<D> newNode = new Node<D>(data), tempNode1 = headNode, tempNode2;

        for (int i = 0; i < index - 1; i++)
            tempNode1 = tempNode1.getNextNode();

        tempNode2 = tempNode1.getNextNode();
        tempNode1.setNextNode(newNode);
        tempNode2.setPrevNode(newNode);
        newNode.setNextNode(tempNode2);
        newNode.setNextNode(tempNode1);

        length++;
    }

    @Override
    public void addEndNode(D data) {
        Node<D> tempNode = new Node<D>(data);

        if (isEmpty())
            headNode = tempNode;

        else {
            tailNode.setNextNode(tempNode);
            tempNode.setPrevNode(tailNode);
        }

        tailNode = tempNode;
        tailNode.setNextNode(headNode);
        headNode.setPrevNode(tailNode);

        length++;
    }

    @Override
    public D removeFrontNode() {
        if (isEmpty())
            return null;

        Node<D> tempNode = headNode;

        if (length == 1)
            headNode = tailNode = null;

        else {
            headNode = headNode.getNextNode();
            headNode.setPrevNode(tailNode);
            tailNode.setNextNode(headNode);
            tempNode.setPrevNode(null);
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
            tailNode.setNextNode(headNode);
            headNode.setNextNode(tailNode);
            tempNode.setPrevNode(null);
            tempNode.setNextNode(null);
        }

        length--;

        return tempNode.getElement();
    }

    @Override
    public void rotate() {
        headNode = headNode.getPrevNode();
        tailNode = tailNode.getPrevNode();

        return;
    }
}