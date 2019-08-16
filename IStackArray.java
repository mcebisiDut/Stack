public interface IStackArray<T> {
    void push(T value);
    T pop() throws EmptyArrayException;
    T peek() throws EmptyArrayException;
    boolean isEmpty();
    boolean isFull();
    void clear();
    void display();
}