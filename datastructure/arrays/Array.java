package datastructure.arrays;

import datastructure.interfaces.adts.ArrayADT;

public class Array<D> implements ArrayADT<D> {

    public static final int CAPACITY = 1000;
    private D[] arr;
    private int capacity;
    private int size;

    public Array() {
        this(CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public Array(int capacity) {
        size = 0;
        this.capacity = capacity;
        arr = (D[]) new Object[capacity];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("invalid index: " + index);

    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public D get(int index) {
        checkIndex(index);
        return arr[index];
    }

    public void set(int index, D value) {
        checkIndex(index);
        arr[index] = value;
    }

    @SuppressWarnings("unchecked")
    private void insertIfFull(int index, D value) {

        D[] newArr = (D[]) new Object[++capacity];

        for (int i = 0; i < size; i++) {
            if (i < index)
                newArr[i] = arr[i];
            else if (i >= index)
                newArr[i + 1] = arr[i];
        }
        newArr[index] = value;
        arr = newArr;
        size++;
    }

    public void insert(int index, D value) {

        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("invalid index: " + index);
        if (size == capacity) {
            insertIfFull(index, value);
            return;
        }

        for (int i = size - 1; i >= index; i--)
            arr[i + 1] = arr[i];

        arr[index] = value;
        size++;
    }

    public int indexOf(D value) {

        for (int i = 0; i < size; i++)
            if ((value == null && arr[i] == null) || (value != null && value.equals(arr[i])))
                return i;

        return -1;
    }

    public D remove(int index) {
        checkIndex(index);

        D temp = arr[index];

        for (int i = index; i < size - 1; i++)
            arr[i] = arr[i + 1];

        arr[size - 1] = null;
        size--;

        return temp;
    }

    public static <D> void display(Array<D> array) {
        System.out.print("Array (size = " + array.size() + "): ");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + "\t");
        }
        System.out.println();
    }
}
