package com.example.graphs;

import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class Food {
        private Circle food;
        private static final short SIZE = 20;

        public Food() {
            food = new Circle(SIZE/2.0);    //half size of the segments is the radius for the food -> equal size
            food.setFill(Color.RED);
            placeRandomly();
        }

        public Circle getFood() {
            return food;
        }

        public void placeRandomly() {
            double x = Math.random() * (600 - SIZE);    //ensuring the circle (food) is not too close to the edge
            double y = Math.random() * (400 - SIZE);
            food.setCenterX(x);
            food.setCenterY(y);
        }
    }

