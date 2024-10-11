package com.example.graphs;

import javafx.fxml.FXML;
import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class HelloController {  //connection to the fxml file

        @FXML
        private AnchorPane gamePane;    //container in the FXML layout
        private Playground playground;

        public void initialize() {  //is called automatically when fxml file is loaded

            playground = new Playground();
            System.out.println("Playground created");
            gamePane.getChildren().add(playground);

            startGame();
        }

        private void startGame() {
            AnimationTimer timer = new AnimationTimer() {   //anonymous class which extends the AnimationTimer class
                @Override
                public void handle(long now) {  //creates a timer that is called in each frame, works as a loop
                    playground.update();
                }
            };
            timer.start();  //starts the timer
        }
//DOPPELT MIT SNAKE MOVE METHOD !!
        public void onKeyPressed(KeyEvent event) {  //controlling user inputs
            switch (event.getCode()) {  //enhanced switch statement
                case UP ->
                    playground.getSnake().move(0, -20);

                case DOWN ->
                    playground.getSnake().move(0, 20);

                case LEFT ->
                    playground.getSnake().move(-20, 0);

                case RIGHT ->
                    playground.getSnake().move(20, 0);

                default -> {}
            }

        }

}