package com.company;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
    class Honda extends Car{

        public Honda(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "super.startEngine()";
        }

        @Override
        public String accelerate() {
            return super.accelerate();
        }

        @Override
        public String brake() {
            return super.brake();
        }
    }

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels=4;
        this.engine=true;


    }
}
