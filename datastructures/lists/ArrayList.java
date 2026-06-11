package datastructure.lists;

public class ArrayList<E> implements ListADT<E> {

  private static final int CAPACITY = 5;
  private int size = 0;
  private E[] array;

  public ArrayList() {
    this(CAPACITY);
  }

  @SuppressWarnings("unchecked")
  public ArrayList(int capacity) {
    array = (E[]) new Object[capacity];
  }

  protected void checkIndex(int i, int size_of_arr) throws IndexOutOfBoundsException {
    if (i < 0 || i >= size_of_arr)
      throw new IndexOutOfBoundsException("Illegal index:" + i);

  }

  public int size() {

    return size;
  }

  public boolean isEmpty() {

    return size() == 0;
  }

  public E get(int i) throws IndexOutOfBoundsException {

    checkIndex(i, size);

    return array[i];
  }

  public E set(int i, E ele) {

    checkIndex(i, size);

    E temp = array[i];
    array[i] = ele;

    return temp;
  }

  public void add(int i, E ele) {

    checkIndex(i, size + 1);

    if (size >= CAPACITY) // if full
      resize(size * 2);

    for (int j = size - 1; j >= i; j--)
      array[j + 1] = array[j];

    array[i] = ele;

    size++;

  }

  public E remove(int i) {

    checkIndex(i, size);

    E element = array[i];

    for (int j = i; j < size; j++)
      array[j] = array[j + 1];

    array[size - 1] = null;

    size--;

    return element;
  }

  @SuppressWarnings("unchecked")
  public void resize(int cap) {

    E[] newArray = (E[]) new Object[cap];

    for (int i = 0; i < size; i++)
      newArray[i] = array[i];

    array = newArray;
  }
}
