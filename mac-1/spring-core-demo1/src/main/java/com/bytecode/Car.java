package com.bytecode;

public class Car {
    private String model;
    private Engine engine;

    public Car() {
        System.out.println("Car object created...");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println("Driving car model: " + model);
        engine.start();
        System.out.println("Vroom! Vroom! 🚗💨");
    }

    @Override
    public String toString() {
        return "Car[model=" + model + ", engine=" + engine + "]";
    }
}
