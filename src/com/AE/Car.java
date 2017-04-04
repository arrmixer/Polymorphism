package com.AE;

/**
 * Created by Angel on 11/12/16.
 */
public class Car {
    private String name;
    private Boolean engine;
    private int cylinders;
    private int wheels;

    private int distance = 0;

    public Car(String name, Boolean engine, int cylinders, int wheels) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;

    }

    public void startEngine(){
        System.out.println(getName() + "'s engine is on.");
    }

    public int accelerate(int speed){
        distance = speed + this.distance;
        System.out.println(getName() +  " is going at " + speed + "mph. And has traveled " + distance + " miles." );
        return distance;

    }

    public int brake(){
        System.out.println(getName() +  " has stopped.");
        return distance = 0;
    }

    public String getName() {
        return name;
    }

    public Boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDistance() {
        return distance;
    }
}
