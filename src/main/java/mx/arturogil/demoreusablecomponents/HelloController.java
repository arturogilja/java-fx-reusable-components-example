package mx.arturogil.demoreusablecomponents;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private void handleClick(ActionEvent event) {
        System.out.println("THIS IS A CLICK");
    }

    @FXML
    private void handleOtherClick(ActionEvent event) {
        System.out.println("THIS IS ANOTHER CLICK");
    }
}
