package com.example.frist_test.pojo;

public class Book {

    private String no;
    private String name;
    private int number;
    private double price;
    private String press;

    public Book() {
    }

    public Book(String no, String name, int number, double price, String press) {
        this.no = no;
        this.name = name;
        this.number = number;
        this.price = price;
        this.press = press;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    @Override
    public String toString() {
        return "Book{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", price=" + price +
                ", press='" + press + '\'' +
                '}';
    }
}
