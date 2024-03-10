module com.eightquiz {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.eightquiz to javafx.fxml;
    exports com.eightquiz;
}
