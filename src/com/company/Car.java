package com.company;

public class Car {
    int id;
    int numberCar;

    public Car(int id, int numberCar) {
        this.id = id;
        this.numberCar=numberCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numberCar=" + numberCar +
                '}';
    }
}
