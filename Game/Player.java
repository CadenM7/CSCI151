package Blackjack.Game;

import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;

    public Player() {
         hand = new ArrayList<Card>();
    }
    public void add(Card card) {
        hand.add(card);
    }

    public int results(int v1, int v2) {
        if (v1 > v2) {
            return 1;
        }
        else if(v1 < v2) {
            return -1;
        } else {
            return 0;
        }
    }

    public int handValue() {
        int value = 0;
        for(int i = 0; i < hand.size(); i++) {
            value += hand.get(i).getCardValues();
        }
        return value;
    }

    public int getLength() {
        return hand.size();
    }
}
