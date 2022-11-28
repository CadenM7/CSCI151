package Game;

public interface Stack<B> {
    public int size();

    public int capacity();

    public B pop();

    public void push(B data);

    public B peek();

    default public boolean isEmpty() {
        return size() == 0;
    }

    // Assertion
    default public void emptyCheck() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot access from empty stack");
        }
    }
}
