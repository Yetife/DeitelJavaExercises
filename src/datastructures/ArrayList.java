package datastructures;

import java.util.Arrays;

public class ArrayList implements List{

    private final boolean isEmpty = true;
    private int size;
    private int[] elements;

    public ArrayList()
    {
        elements = new int[3];
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(int element) {
        boolean isFull = getCapacity() == size;
        if(isFull){
            int[] newArray = new int[elements.length * 2];//create new array
            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
        }
        elements[size++] = element;
//        size++;
    }
    @Override
    public void add(int element, int position) {
        elements[position] = element;
    }

    @Override
    public void remove(int element) {
        if (isEmpty()) throw new IllegalArgumentException("ArrayList is empty");
        //find value(position) in elements;
        //overwrire it with values in the right
        int position = getIndexOf(element);
        for (int i = position; i < size ; i++) {
            try {
                elements[i] = elements[i + 1];
            }
            catch (ArrayIndexOutOfBoundsException ex){
            }
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int get(int position) {
        return elements[position];
    }

    @Override
    public int getCapacity() {
        return elements.length;
    }

    @Override
    public int getIndexOf(int element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element){
                return i;
            }
        }
        return 0;
    }

    @Override
    public void insert() {

    }
}
