package ru.itis.inf301.game;

public abstract class Entity implements Moveable, Printable{
    protected String name;
    protected Point point;

    public void print(){
        System.out.print(name + " " + point);
    }
    public abstract Point move();

    public void init(){
        point = new Point((int) (Math.random()*1001),(int) (Math.random()*1001) );
    }
    public void checkBoard(Point pointPrev) {
        if ((point.getColumn() > 1000) || (point.getColumn() < 0) || (point.getRow() < 0) || (point.getRow() > 1000)) {
            point.setRow(pointPrev.getRow());
            point.setColumn(pointPrev.getColumn());
        }
    }
}
