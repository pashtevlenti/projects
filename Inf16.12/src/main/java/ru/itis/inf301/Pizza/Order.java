package ru.itis.inf301.Pizza;

public class Order {
    Client client;
    Cook cook;
    Pizza pizza;
    String time;
    StatusOrder status;
    int number;

    public Order(Client client, Cook cook, Pizza pizza, String time, StatusOrder status, int number) {
        this.client = client;
        this.cook = cook;
        this.pizza = pizza;
        this.time = time;
        this.status = status;
        this.number = number;
    }
    public void processOrder(NextNumbers number){
        this.number = number.next();
        this.status = StatusOrder.processing;
    }
}
