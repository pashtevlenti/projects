package ru.itis.inf301.game;

public class Somewhat extends Entity{
    Somewhat(String name){
        this.name = name;
    }
    @Override
    public Point move() {
        point = new Point((int) (Math.random()*1001),(int) (Math.random()*1001) );
        return point;
    }
}
