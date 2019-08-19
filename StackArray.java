import java.io.Console;
import java.util.*;

public class StackArray<T> implements IStackArray<T> {
    private T[] numbers;
    private Integer size;

    public StackArray() {
        size = 0;
        numbers = (T[]) new Object[10];
    }

    public void push(T number) {
        if (isFull()) {
            numbers = Arrays.copyOf(numbers, 2 * numbers.length);
        }
        numbers[size] = number;
        size++;
    }

    public T pop() throws EmptyArrayException {
        if (isEmpty()) {
            throw new EmptyArrayException("Cannot pop item on an empty array");
        }
        size--;
        return numbers[size];
    }

    public T peek() throws EmptyArrayException{
        if (isEmpty()) {
            throw new EmptyArrayException("Cannot peek item on an empty array");
        }
        return numbers[size - 1];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == numbers.length);
    }

    public void clear() {
        size = 0;
    }

    public void display() {
        for (int index = 0; index < size; index++) {
            System.out.println(numbers[index]);
        }
    }
}