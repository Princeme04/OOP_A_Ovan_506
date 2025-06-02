package com.practicum;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Halo, ini GUI JavaFX di IntelliJ!");
        Button button = new Button("Jangan Klikkkk");

        button.setOnAction(_ -> label.setText("Tombol sudah diklik!"));

        VBox layout = new VBox(50);
        HBox hbox = new HBox(50);
        layout.getChildren().addAll(label, button);

        Scene scene = new Scene(layout, 300, 200);

        primaryStage.setTitle("Jangan Dibuka!!!!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
