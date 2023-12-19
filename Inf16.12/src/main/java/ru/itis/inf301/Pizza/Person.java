package ru.itis.inf301.Pizza;

public abstract class Person {
    String fio;
    Gender gender;

    public Person(String fio, Gender gender) {
        this.fio = fio;
        this.gender = gender;
    }
}
