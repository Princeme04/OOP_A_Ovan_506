module com.practicum.task {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.practicum.task to javafx.fxml;
    exports com.practicum.task;
}