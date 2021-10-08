package datastructures;

public interface List {

    boolean isEmpty();

    void add(int element);

    void add(int element, int position);

    void remove(int element);

    int size();

    int get(int i);
    
    int getCapacity();

    int getIndexOf(int element);

    void insert();
}
