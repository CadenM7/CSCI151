package Blackjack.GUI;

import Blackjack.Game.Blackjack;
import Blackjack.Game.Card;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

import java.io.File;

public class BlackjackController {

    @FXML
    private Pane pane;

    @FXML
    private Label label;

    @FXML
    private TextField playerScore;

    @FXML
    private TextField dealerScore;

    @FXML
    private ImageView cardImage;

    @FXML
    private Button hit;

    @FXML
    private Button stand;

    private Blackjack blackjack;

    private Card card;

    @FXML
    public void initialize() {
        blackjack = new Blackjack(52);
    }

    public void reset() {
        blackjack = new Blackjack(52);
        updateView();
    }

    public void updateView() {
        setCardImage(blackjack.getCard().ab());
        int size = 10;

    }
    @FXML
    public void hit() {
        blackjack.playerHit();
        updateView();
    }
    @FXML
    public void stand() {
        blackjack.playerStand();
        updateView();
    }

    public void setCardImage(String cd) {
        cd = card.ab();
        File c = new File("src/Blackjack/Cards" + cd + ".png");
        System.out.print(c.toURI().toString());
        cardImage.setImage(new Image(c.toURI().toString()));
    }

    public void disableButton(boolean disable) {
        hit.setDisable(disable);
        stand.setDisable(disable);
    }
}

