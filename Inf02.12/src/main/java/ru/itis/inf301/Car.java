package ru.itis.inf301;

public class Car {
    private final int places = 5;
    private int persons = 2;
    public int getPersons() {
        return persons;
    }
    public int getPlaces(){
        return places;
    }
    public void review() throws BrokeCar {
        if (Math.random() < 0.6) {
            throw new BrokeCar();
        }
    }
}
