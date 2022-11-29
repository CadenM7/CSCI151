package Game;

public class Card {
    private CardSuits suit;
    private CardValues values;

    public Card (CardValues values, CardSuits suit) {
        this.values = values;
        this.suit = suit;
    }
    public CardSuits getSuit() {
        return suit;
    }

    public void setSuit(CardSuits suit) {
        this.suit = suit;
    }

    public CardValues getCardValues() {
        return values;
    }

    public void setCardValue(CardValues cardValue)
    {
        this.values = cardValue;
    }

    public boolean equals (Object other) {
        if(other instanceof Card) {
            Card c = (Card)other;
        }
        return false;
    }
}
