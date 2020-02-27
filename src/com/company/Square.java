package com.company;

import java.io.Serializable;

public class Square implements Serializable {

    private int x;
    private int y;
    private String nameOfSquare;

    public Square(int x, int y, String nameOfSquare){
        this.x = x;
        this.y = y;
        this.nameOfSquare = nameOfSquare;
    }

    public String getNameOfSquare(){
        return nameOfSquare;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
