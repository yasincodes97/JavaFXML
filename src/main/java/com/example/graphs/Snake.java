package com.example.graphs;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<Rectangle> body = new ArrayList<>();
    private final short SIZE = 20;  //size of segments

    public Snake() {
        Rectangle head = new Rectangle(SIZE, SIZE);

        head.setFill(Color.GREEN);
        head.setX(300); //300 pixels from left
        head.setY(200); //200 pixels from above
        body.add(head); //adding the head to the arrayList
    }

    public List<Rectangle> getBody() {
        return body;
    }

    public void move(double x, double y) {  //method to move the snake through the head
        Rectangle head = body.get(0);   //first element in the arrayList is the head
        head.setX(head.getX() + x);
        head.setY(head.getY() + y);
    }

    public void grow() {    //method to grow the snake
        Rectangle newSegment = new Rectangle(SIZE, SIZE);
        newSegment.setFill(Color.GREEN);
        Rectangle tail = body.get(body.size() - 1); //access the last element in the arrayList, -1 because
        newSegment.setX(tail.getX());
        newSegment.setY(tail.getY());
        body.add(newSegment);   //adding the new segment to the arrayList (body)
    }
}
