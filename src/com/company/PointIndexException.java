package com.company;

public class PointIndexException extends Exception {
    private int index;

    public PointIndexException(int index) {
        super("Некорректный номер точки фигуры!");
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
