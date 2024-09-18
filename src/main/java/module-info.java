module com.eaglewings {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.eaglewings to javafx.fxml;
    exports com.eaglewings;
}
