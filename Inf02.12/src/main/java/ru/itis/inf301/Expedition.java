package ru.itis.inf301;

public class Expedition {
    private int count = 10;
    private int distance = 1000;
    private int broke = 50;
    public boolean isWin() throws BrokeCar {
        return win();
    }
    private static Car[] cars(int count){
        Car[] cars = new Car[count];
        for (int i = 0; i < count; ++i){
            cars[i] = new Car();
        }
        return cars;
    }
    private boolean win() throws  BrokeCar, ArrayIndexOutOfBoundsException{
        Car[] cars = cars(this.count);
        double checkCountCar = ((double) (cars.length * cars[0].getPersons())) / cars[0].getPlaces();
        int countCar =  (checkCountCar % 1 == 0) ? (int) checkCountCar : ((int) checkCountCar) + 1;
        int k = 0;
        for (int i = 0; i<distance; ++i){
            if (i % broke == 0) {
                try {
                    cars[k].review();
                    k++;
                } catch (BrokeCar e) {
                    --count;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    break;
                }
            }
        }
        return count >= countCar;
    }

}
