package com.example.graphs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
public class HelloApplication extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            primaryStage.setTitle("Snake Game");
            primaryStage.setScene(scene);
            primaryStage.show();

        }
        public static void main(String[] args) {
            launch(args);
            System.out.println("Snake game running..");
        }
    }