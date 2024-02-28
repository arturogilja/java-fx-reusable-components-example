package mx.arturogil.demoreusablecomponents;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private VBox vBox;
    private ArrayList<CardData> cards = new ArrayList<>();

    @FXML
    void initialize() {
        CardData card1 = new CardData("Card 1", "Delete 1");
        CardData card2 = new CardData("Card 2", "Delete 2");
        CardData card3 = new CardData("Card 3", "Delete 3");
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        for(CardData card : cards) {
            ReusableCard cardNode = new ReusableCard();
            cardNode.setLabelText(card.getCardText());
            cardNode.setButtonText(card.getCardButtonText());
            cardNode.setOnAction((e) -> {
                cards.remove(card);
                vBox.getChildren().remove(cardNode);
            });
            vBox.getChildren().add(cardNode);
        }

    }
    @FXML
    private void handleClick(ActionEvent event) {
        System.out.println("THIS IS A CLICK");
    }

    @FXML
    private void handleOtherClick(ActionEvent event) {
        System.out.println("THIS IS ANOTHER CLICK");
    }
}
