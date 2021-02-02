package com.example.frist_test.pojo;

public class Car {

    private String name;
    private String color;
    private int number;
    private double price;

    public Car() {
    }

    public Car(String name, String color, int number, double price) {
        this.name = name;
        this.color = color;
        this.number = number;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", number=" + number +
                ", price=" + price +
                '}';
    }
}
