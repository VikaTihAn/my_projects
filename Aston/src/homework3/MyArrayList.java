package homework3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class MyArrayList<Type> {
    private int size;
    private Object[] list;

    public MyArrayList() {
        this.list = new Object[10];
    }

    public MyArrayList(int size) {
        this.list = new Object[size];
    }

    public MyArrayList(Collection<? extends Type> collection) {
        list = new Object[collection.size()];
        int i = 0;
        for(Type newCol: collection) {
            list[i++] = newCol;
        }
    }

    @SuppressWarnings("unchecked")
    public Type get(int index) {
        if(index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (Type) list[index];
    }

    public void add(Type type) {
        if(size == list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }
    }

    public void add(int index, Type type) {
        if(index > list.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.arraycopy(list, 0, list, index + 1, size);
        list[index] = type;
        size++;
    }

    public void addAll(Collection<Type> collection) {
        Object[] col = collection.toArray();
        System.arraycopy(col, 0, list, size, col.length);
        size += col.length;
    }

    public void remove(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        list[index] = null;
        size--;
        System.arraycopy(list, index, list, index + 1, size - index);
    }

    public void sortCollection(Comparator<Object> t) {
        boolean flag = true;
        Object buf;
        while (flag) {
            for(int i = 0; i < list.length - 1; i++) {
                    if (t.compare(list[i], list[i + 1]) > 0) {
                        buf = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = buf;
                        flag = false;
                }
            }
        }
    }

}
