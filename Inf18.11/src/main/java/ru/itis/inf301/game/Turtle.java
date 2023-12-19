package ru.itis.inf301.game;

public class Turtle extends Entity{
    Turtle(String name){
        this.name = name;
    }
    @Override
    public Point move() {
        int direction = (int) (Math.random() * 5);
        Point pointPrev = new Point(point.getRow(),point.getColumn());
        switch (direction) {
            case 0: point.setColumn(point.getColumn() - 1); point.setRow(point.getRow() - 1); break;
            case 1: point.setRow(point.getRow() - 1); point.setColumn(point.getColumn() + 1); break;
            case 2: point.setColumn(point.getColumn() + 1); break;
            case 3: point.setRow(point.getRow() + 1); point.setColumn(point.getColumn() + 1); break;
            case 4: point.setRow(point.getRow() + 1); point.setColumn(point.getColumn() - 1); break;
        }
        super.checkBoard(pointPrev);
        return point;
    }
}
