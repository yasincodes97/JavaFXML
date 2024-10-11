package com.example.graphs;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Playground extends Pane{  //to use it in FXML, it needs to extend JavaFX-Component s.a. Pane, Node

    private Snake snake;
    private Food food;

    private short width;

    private short height;

    public Playground() {
        this.snake = new Snake();
        System.out.println("Snake created");
        this.food = new Food();
        System.out.println("Food created");

        getChildren().addAll(snake.getBody());  //adding the snake and food to the playground
        getChildren().add(food.getFood());
    }

    public Snake getSnake() {
        return snake;
    }

    public Food getFood() {
        return food;
    }

    private boolean checkCollision(Rectangle snakeHead, Circle food) {
        return snakeHead.getBoundsInParent().intersects(food.getBoundsInParent());
    }

    private boolean isOutOfBounds(Rectangle snakeHead) {
        return snakeHead.getX() < 0 || snakeHead.getX() >= 600 || snakeHead.getY() < 0 || snakeHead.getY() >= 400;
    }

    private boolean checkSelfCollision() {
            Rectangle head = snake.getBody().get(0);
        for (int i = 1; i < snake.getBody().size(); i++) {
            if (head.getBoundsInParent().intersects(snake.getBody().get(i).getBoundsInParent())) {
                return true;
            }
        }
        return false;
    }

    private boolean isGameOver() {
        Rectangle head = snake.getBody().get(0);
        return checkSelfCollision() || isOutOfBounds(head);
    }

    public void update() {
            snake.move(width, height);

            if (checkCollision(snake.getBody().get(0), food.getFood())) {
            snake.grow();
            food.placeRandomly();
                }

            if (isOutOfBounds(snake.getBody().get(0)) || checkSelfCollision()) {
            System.out.println("Game Over!");
                System.exit(0);
                }
    }

}


