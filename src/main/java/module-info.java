module mx.arturogil.demoreusablecomponents {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens mx.arturogil.demoreusablecomponents to javafx.fxml;
    exports mx.arturogil.demoreusablecomponents;
}