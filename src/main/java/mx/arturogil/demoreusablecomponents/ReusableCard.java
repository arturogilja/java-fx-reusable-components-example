package mx.arturogil.demoreusablecomponents;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ReusableCard extends AnchorPane {
    @FXML private Label label;
    @FXML private Button button;

    public ReusableCard() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("reusable-card.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public void setLabelText(String labelText) {
        this.label.setText(labelText);
    }

    public String getLabelText() {
        return this.label.getText();
    }

    public void setButtonText(String buttonText) {
        this.button.setText(buttonText);
    }

    public String getButtonText() {
        return this.button.getText();
    }

    public void setOnAction(EventHandler<ActionEvent> handler) {
        this.button.setOnAction(handler);
    }

    public EventHandler<ActionEvent> getOnAction() {
        return this.button.getOnAction();
    }

}
