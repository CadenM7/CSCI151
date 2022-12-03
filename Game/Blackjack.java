package Blackjack.Game;

public class Blackjack {
    private Player player;

    private Player player2;

    private int playerScore;

    private int player2Score;

    private BlackjackStack deck;

    private int size;

    private int turn = 1;


    public Blackjack(int size) {
        this.size = size;
        deck = new BlackjackStack();
        deck.shuffle();

        player = new Player();
        player2 = new Player();

        player.add(deck.pop());
        player2.add(deck.pop());

        player.add(deck.pop());
        player2.add(deck.pop());
        }

    public String toString() {
        String s = "";
        for(int p1 = 0; p1 < player.getLength(); p1++) {
            s += player.handValue();
            for(int p2 = 0; p2 < player2.getLength(); p2++) {
                s += player2.handValue();
            }
            s += "\n";
        }
        return s;
    }

    public void playerHit() {
        if(turn == 1) {
            player.add(deck.pop());
        }
    }

    public void playerStand() {
        if(turn == 1) {
            turn = -1;
        }
    }

    public void dealerHit() {
        if(turn == -1) {
            if(player2.handValue() < 17) {
                player2.add(deck.pop());
            }
        }
    }
    public void dealerStand() {
        if(turn == -1) {
            if(player2.handValue() == 17) {
                turn = 0;
            }
        }
    }
    public void determine() {
        if(turn == 0) {

        }
    }

    public Card getCard() {
        return deck.pop();
    }

}


