package com.practicum;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.Random;

public class AdvanceGuessApp extends Application {

    private int numberToGuess;
    private int attempts;

    private Label feedbackLabel;
    private Label attemptsLabel;

    @Override
    public void start(Stage primaryStage) {
        // Generate random number
        Random rand = new Random();
        numberToGuess = rand.nextInt(100) + 1;
        attempts = 0;

        // Title label
        Label titleLabel = new Label("🔭 Tebak Angka 1–100");
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        titleLabel.setTextFill(Color.DARKBLUE);

        // Feedback label
        feedbackLabel = new Label("");
        feedbackLabel.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        feedbackLabel.setTextFill(Color.ORANGE);

        // Input
        TextField inputField = new TextField();
        inputField.setPromptText("Masukkan angka di sini");
        inputField.setMaxWidth(200);

        // Button
        Button guessButton = new Button("✅ Coba Tebak!");
        guessButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white;");

        // HBox for input and button
        HBox inputBox = new HBox(10, inputField, guessButton);
        inputBox.setAlignment(Pos.CENTER);

        // Attempts label
        attemptsLabel = new Label("Jumlah percobaan: 0");
        attemptsLabel.setFont(Font.font("Arial", 12));
        attemptsLabel.setTextFill(Color.DIMGRAY);

        // VBox Layout
        VBox layout = new VBox(15, titleLabel, feedbackLabel, inputBox, attemptsLabel);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));
        layout.setStyle("-fx-background-color: #e6f0ff;");

        // Button logic
        guessButton.setOnAction(e -> {
            String userInput = inputField.getText();
            try {
                int guess = Integer.parseInt(userInput);
                attempts++;
                if (guess < numberToGuess) {
                    feedbackLabel.setText("▲ Terlalu kecil!");
                    feedbackLabel.setTextFill(Color.ORANGE);
                } else if (guess > numberToGuess) {
                    feedbackLabel.setText("▼ Terlalu besar!");
                    feedbackLabel.setTextFill(Color.ORANGE);
                } else {
                    feedbackLabel.setText("🎉 Benar! Kamu menebaknya!");
                    feedbackLabel.setTextFill(Color.GREEN);
                }
                attemptsLabel.setText("Jumlah percobaan: " + attempts);
            } catch (NumberFormatException ex) {
                feedbackLabel.setText("⚠ Masukkan angka yang valid!");
                feedbackLabel.setTextFill(Color.RED);
            }
        });

        // Setup scene and stage
        Scene scene = new Scene(layout, 400, 250);
        primaryStage.setTitle("Tebak Angka Advance");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
