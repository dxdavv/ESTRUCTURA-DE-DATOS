module com.ang {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ang to javafx.fxml;
    exports com.ang;
}
