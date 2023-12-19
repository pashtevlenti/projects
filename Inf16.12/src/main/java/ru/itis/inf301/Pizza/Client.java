package ru.itis.inf301.Pizza;

public class Client extends Person {
    Discounts discount;

    public Client(String fio, Gender gender) {
        super(fio, gender);
    }

    public Client(String fio, Gender gender, Discounts discount) {
        super(fio, gender);
        this.discount = discount;
    }
}
