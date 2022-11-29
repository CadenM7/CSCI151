package Game;

public class Blackjack {

    private int player = 0;

    private int dealer = 0;

    private boolean draw;

    private boolean lose;

    private boolean won;

    private int size;


    public Blackjack(int size) {
        this.size = size;
    }

    public String toString() {

        return null;
    }

    public void dealer() {
        if(dealer == 17) {
            //The dealer has to stand
        }
        if(dealer <= 16){
            //The dealer has to hit
        }

    }
}


