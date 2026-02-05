package DataConstruture_algorithm.Algorithm_CourseWork;

import java.util.Arrays;

public class GenericPraticeClass<E> {
    Object[] elements = new Object[10];
    int size = 0;

    public boolean add(E e) {
        elements[size++] = e;
        return true;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return Arrays.toString(elements);
    }
}
