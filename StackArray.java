import java.io.Console;
import java.util.*;

public class StackArray<T> implements IStackArray<T> {
    private T[] items;
    private Integer size;

    public StackArray() {
        size = 0;
        items = (T[]) new Object[10];
    }

    public void push(T value) {
        if (isFull()) {
            items = Arrays.copyOf(items, 2 * items.length);
        }
        items[size] = value;
        size++;
    }

    public T pop() throws EmptyArrayException {
        if (isEmpty()) {
            throw new EmptyArrayException("Cannot pop item on an empty array");
        }
        size--;
        return items[size];
    }

    public T peek() throws EmptyArrayException{
        if (isEmpty()) {
            throw new EmptyArrayException("Cannot peek item on an empty array");
        }
        return items[size - 1];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == items.length);
    }

    public void clear() {
        size = 0;
    }

    public void display() {
        for (int index = 0; index < size; index++) {
            System.out.println(items[index]);
        }
    }
}