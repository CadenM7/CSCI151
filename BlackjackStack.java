package Game;

public class BlackjackStack<B> implements Stack<B> {

    private int top;

    private B[] deck;

    public BlackjackStack(){this(2);}

    public BlackjackStack(int size) {
        top = 0;
        deck = (B[])(new Object[size]);
    }

    @Override
    public int size() {return top;}

    @Override
    public B pop() {
        emptyCheck();
        top--;
        B temp = deck[top];
        return temp;
    }
    @Override
    public B peek() {
        emptyCheck();
        return deck[top - 1];
    }

    @Override
    public void push(B b) {
        resize();
        deck[top] = b;
        top++;
    }

    private void resize() {
        if (top == deck.length) {
            B[] deck2 = (B[])(new Object[deck.length * 2]);
            for (int i = 0; i < deck.length; i++) {
                deck2[i] = deck[i];
            }
            deck = deck2;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < top; i++) {
            s += deck[i] + " ";
        }
        return s;
    }

    @Override
    public int capacity() {
        return deck.length;
    }
}
