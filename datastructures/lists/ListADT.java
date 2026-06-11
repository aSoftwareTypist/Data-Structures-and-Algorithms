package datastructure.lists;

public interface ListADT<E> {
  int size();

  boolean isEmpty();

  E get(int index);

  E set(int index, E value);

  void add(int index, E value);

  E remove(int index);
}
