package com.company;

public class CarInfo {
    int year;
    String color;
    int price;
    String model;

    @Override
    public String toString() {
        return "CarInfo{" +
                "year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }

    public CarInfo(int year, String color, int price, String model) {
        this.year = year;
        this.color = color;
        this.price = price;
        this.model = model;
    }
}
