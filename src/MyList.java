import java.util.Arrays;

    //Tao lop MyList voi cac thuoc tinh nhu mo ta
public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 0;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    //Phuong thuc tang gap doi kich thuoc mang
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    // Them phan tu vao cuoi danh sach
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    //Phuong thuc get() tra ve phan tu vua o vi tri i trong list
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
}
