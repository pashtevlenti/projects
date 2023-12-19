package ru.itis.inf301.Pizza;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Client client1 = new Client("Костя",Gender.male,Discounts.students);
        Client client2 = new Client("Валя",Gender.female,Discounts.pensioners);
        Client client3 = new Client("Ишхан",Gender.male);

        Cook cook1 = new Cook("Паша",Gender.male);
        Cook cook2 = new Cook("Роберт",Gender.female);
        System.out.println();



    }
}