package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(8,"Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }
}
