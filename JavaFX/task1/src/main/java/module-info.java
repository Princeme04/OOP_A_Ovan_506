module com.practicum.MyJavaFX {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.practicum to javafx.fxml;
    exports com.practicum;
}