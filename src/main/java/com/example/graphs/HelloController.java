package com.example.graphs;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}