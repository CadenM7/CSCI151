package Game;

public class DeckRandom {

    private Card card;

    private BlackjackStack<Card> deck;

    private int size;

    public DeckRandom(int size) {
        this.size = size;
        size = 0;
        for(CardSuits s: CardSuits.values()) {
            for(CardValues v: CardValues.values()) {
                card = new Card(v,s);
                deck.push(card);
                size++;
            }
        }
        deck.shuffle();
    }
}
