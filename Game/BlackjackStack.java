package Game;

import java.util.Random;

public class BlackjackStack<D> implements Stack<D> {

    private int top;

    private D[] deck;

    public BlackjackStack(){this(52);}

    public BlackjackStack(int size) {
        top = 0;
        deck = (D[])(new Object[size]);
    }

    @Override
    public int size() {return top;}

    @Override
    public D pop() {
        emptyCheck();
        top--;
        D temp = deck[top];
        return temp;
    }
    @Override
    public D peek() {
        emptyCheck();
        return deck[top - 1];
    }

    @Override
    public void push(D d) {
        resize();
        deck[top] = d;
        top++;
    }

    private void resize() {
        if (top == deck.length) {
            D[] deck2 = (D[])(new Object[deck.length * 2]);
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

    public void shuffle() {
        for (int i = 0; i < size(); i++) {
            Random r = new Random();
            int index = r.ints(i, size()).findFirst().getAsInt();
            D temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }
}


