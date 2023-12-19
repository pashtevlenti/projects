package ru.itis.inf301;

public class Main {
    public static void main(String[] args) throws BrokeCar {
        int count = 0;
        for (int j = 0; j<=1000; ++j){
            Expedition exp = new Expedition();
            if (exp.isWin()) {
                count+=1;
            }
        }
        System.out.println(count/10 + "% вероятность успеха экспедиции");
    }
}