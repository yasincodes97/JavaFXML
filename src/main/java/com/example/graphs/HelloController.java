package com.example.graphs;

import javafx.fxml.FXML;
import javafx.animation.AnimationTimer;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
public class HelloController {  //connection to the fxml file
    public HelloController() {
        Playground playground1 = new Playground("Test");
    }
    @FXML
    public Label scoreLabel;

    @FXML
        private AnchorPane gamePane;    //container in the FXML layout

        private Playground playground;
        public void initialize() {  //is called when game is initialized
            playground = new Playground("Yasin");
            gamePane.getChildren().add(playground);

            startGame();
        }
        private void startGame() {
            AnimationTimer timer = new AnimationTimer() {   //anonymous class
                @Override   //creates a timer that is called in each frame
                public void handle(long now) {
                    playground.update();
                }
            };
            timer.start();
        }
        @FXML
        public void onKeyPressed(KeyEvent event) {  //controlling user inputs
            switch (event.getCode()) {  //enhanced switch statement
                case UP -> {
                    playground.getSnake().move(0, -20);
                    break;
                }
                case DOWN -> {
                    playground.getSnake().move(0, 20);
                    break;
                }
                case LEFT -> {
                    playground.getSnake().move(-20, 0);
                    break;
                }
                case RIGHT -> {
                    playground.getSnake().move(20, 0);
                    break;
                }
                default -> {break;}
            }

        }


}