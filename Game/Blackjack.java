package Game;

public class Blackjack {

    private int player;

    private int dealer;

    private boolean draw;

    private boolean lose;

    private boolean won;

    private Card cards;

    private int size;


    public Blackjack(int size) {
        this.size = size;
        DeckRandom deck = new DeckRandom(52);
        
    }

    public String toString() {

        return null;
    }
}


