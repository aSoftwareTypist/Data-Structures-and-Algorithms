package datastructures.trees;

import datastructures.Iterator;

public class BinaryTree<E> {

  protected static class Node<E> {
    private E element;
    private Node<E> parentNode;
    private Node<E> leftChildNode;
    private Node<E> rightChildNode;

    public Node(E value, Node<E> parent, Node<E> left, Node<E> right) {
      this.element = value;

      this.parentNode = parent;
      this.leftChildNode = left;
      this.rightChildNode = right;
    }

    public E getElement() {
      return element;
    }

    public Node<E> getParentNode() {
      return parentNode;
    }

    public Node<E> getLeftChildNode() {
      return leftChildNode;
    }

    public Node<E> getRightChildNode() {
      return rightChildNode;
    }

    public void setElement(E element) {
      this.element = element;
    }

    public void setParentNode(Node<E> parentNode) {
      this.parentNode = parentNode;
    }

    public void setLeftChildNode(Node<E> leftChildNode) {
      this.leftChildNode = leftChildNode;
    }

    public void setRightChildNode(Node<E> rightChildNode) {
      this.rightChildNode = rightChildNode;
    }
  }

  private class ElementIterator implements Iterator<E> {
  
    
  }
  protected Node<E> root;
  private int size;

  protected Node<E> createNode(E e, Node<E> p, Node<E> l, Node<E> r) {
    return new Node<E>(e, p, l, r);
  }

  public BinaryTree() {
    root = null;
    size = 0;
  }

  public Node<E> validateNode(Node<E> n) {
    if (n == null || !(n instanceof Node))
      throw new IllegalArgumentException("Not a valid position type");

    // deleted nodes must have parent reference to itsself. this eliminates the
    // confusion of root node, or getting reference of deleted node.
    Node<E> p = (Node<E>) n;
    if (!(p.getParentNode() == p))
      throw new IllegalArgumentException("node is no longer in a tree");

    return p;
  }

  public E getElement(Node<E> n) {
    validateNode(n);
    return n.getElement();
  }

  public Node<E> root() {
    return root;
  }

  public Node<E> parent(Node<E> p) throws IllegalArgumentException {
    return p.getParentNode();
  }

  public Node<E> left(Node<E> node) {
    return node.getLeftChildNode();
  }

  public Node<E> right(Node<E> node) {
    return node.getRightChildNode();
  }

  public Node<E> addRoot(E value) {

    if (root != null || !isEmpty())
      throw new IllegalArgumentException("Tree is not empty");

    Node<E> newNode = createNode(value, root, null, null);

    root = newNode;
    size = 1;
    return newNode;
  }

  public Node<E> addLeft(Node<E> node, E value) {

    Node<E> parent = validateNode(node);

    if (parent.getLeftChildNode() != null)
      throw new IllegalArgumentException("node already has a left child");

    Node<E> newNode = createNode(value, parent, null, null);

    parent.setLeftChildNode(newNode);
    size++;

    return newNode;
  }

  public Node<E> addRight(Node<E> node, E value) {

    Node<E> parent = validateNode(node);

    if (parent.getRightChildNode() != null)
      throw new IllegalArgumentException("node already has a right child");

    Node<E> newNode = createNode(value, parent, null, null);
    parent.setRightChildNode(newNode);
    size++;

    return newNode;
  }

  public E set(Node<E> node, E value) {

    Node<E> n = validateNode(node);
    E prevValue = n.getElement();

    n.setElement(value);
    return prevValue;
  }

  public void attach(BinaryTree<E> tree1, BinaryTree<E> tree2) {

  }

  public E remove(Node<E> node) {

    Node<E> temp = validateNode(node);
    if (numChildren(node) == 2)
      throw new IllegalArgumentException("cannot delete node, it has 2 childrens");

    E element = temp.getElement();

    Node<E> parent = temp.getParentNode();
    Node<E> child = (temp.getRightChildNode() != null) ? temp.getRightChildNode() : temp.getLeftChildNode();

    if (child != null)
      child.setParentNode(parent);

    if (isRoot(temp)) {
      root = child;
    } else {
      if (temp == parent.getLeftChildNode())
        parent.setLeftChildNode(child);
      else
        parent.setRightChildNode(child);
    }
    size--;

    // convention for deleted node is to set parent to itself. or else it seems as
    // root.
    node.setParentNode(node);
    node.setLeftChildNode(null);
    node.setRightChildNode(null);

    return element;
  }

  public int numChildren(Node<E> p) throws IllegalArgumentException {

    int number = 0;
    number = p.getLeftChildNode() != null ? number + 1 : 0;
    number = (p.getRightChildNode() != null) ? number + 1 : 0;

    return number;
  }

  /*
   * @ Query Method
   */
  public boolean isInternal(Node<E> p) throws IllegalArgumentException {
    return (numChildren(p) > 0);
  }

  /*
   * @ Query Method
   */
  public boolean isExternal(Node<E> p) throws IllegalArgumentException {

    return (numChildren(p) == 0);
  }

  /*
   * @ Query Method
   */
  public boolean isRoot(Node<E> p) throws IllegalArgumentException {

    return p == root();
  }

  /*
   * @ Utility Method
   */

  public int size() {
    return size;
  }

  /*
   * @ Utility Method
   */
  public boolean isEmpty() {
    return size() == 0;
  }

  public Iterator<E> iterator(){
        
        return 
    };

  public Iterable<Node<E>> children(Node<E> p) throws IllegalArgumentException;

  public Iterable<Node<E>> Nodes();
}
