package ru.itis.inf301;

public class Person {
    private String fio;

    public Person(String fio, Gender gender) {
        this.fio = fio;
        this.gender = gender;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    private Gender gender;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + fio + '\'' +
                ", gender=" + gender.getFullName() +
                '}';
    }
}
