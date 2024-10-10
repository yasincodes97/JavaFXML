package com.example.graphs;

public class Player {
    private final String name;  //final because it´s not changeable, therefore has no setter()
    private short score;    //mostly used datatype "short" to save memory
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }
    public short getScore() {
        return score;
    }
    public String getName() {
        return name;
    }
    public void increaseScore(short value) {
        this.score += value;
    }
    public void resetScore() {
        this.score = 0;
    }
}

