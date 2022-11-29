package GUI;

import Game.Blackjack;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class BlackjackController {

    private Blackjack blackjack;

    public void initialize() {
        blackjack = new Blackjack(52);
    }
    public void reset() {
        blackjack = new Blackjack(52);
        updateView();
    }

    public void updateView() {

    }
}
