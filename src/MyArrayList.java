import java.util.Arrays;

public class MyArrayList<E> {
    private Object[] elements;
    private int size;
    private static final int Initial_Capacity = 10;

    public MyArrayList() {
        elements = new Object[Initial_Capacity];
        size = 0;
    }

    public void add(E element) {
    	
    	
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("MyArrayList:");
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println("MyArrayList after removal:");
        System.out.println(arrayList);
	}
}
