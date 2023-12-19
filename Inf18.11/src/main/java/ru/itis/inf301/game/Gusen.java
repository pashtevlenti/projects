package ru.itis.inf301.game;

public class Gusen extends Entity{
    Gusen(String name){
        this.name = name;
    }
    @Override
    public Point move() {
        int direction = (int) (Math.random() * 3);
        Point pointPrev = new Point(point.getRow(),point.getColumn());
        switch (direction) {
            case 0: point.setRow(point.getRow() - 1); break;
            case 1: point.setColumn(point.getColumn() + 1); break;
            case 2: point.setRow(point.getRow() + 1); break;
        }
        super.checkBoard(pointPrev);
        return point;
    }
}

