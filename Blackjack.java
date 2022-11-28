package Game;

public class Blackjack {

    private int player = 0;

    private int dealer = 0;

    private boolean draw;

    private boolean lose;

    private boolean won;

    private CardValues values;

    private CardRandomizer shuffle;

    private int size;


    public Blackjack(int size) {
        this.size = size;

        if (player == 21) {
            won = true;
        }
        if (dealer == 21) {
            lose = true;
        } else if (player > 21 || dealer > 21) {
            draw = true;
        } else if (player > 21 && dealer < 21) {
            lose = true;
        } else if (player < 21 && dealer > 21) {
            won = true;
        }
    }

    public String toString() {

        return null;
    }

    public void dealer() {

    }
}


