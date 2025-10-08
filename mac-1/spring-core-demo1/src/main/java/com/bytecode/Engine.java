package com.bytecode;

public class Engine {
    private String type;
    private int horsepower;

    public Engine() {
        System.out.println("Engine object created...");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void start() {
        System.out.println("Engine started! Type: " + type + ", Horsepower: " + horsepower);
    }

    @Override
    public String toString() {
        return "Engine[type=" + type + ", horsepower=" + horsepower + "]";
    }
}

