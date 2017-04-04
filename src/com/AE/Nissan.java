package com.AE;

/**
 * Created by Angel on 11/12/16.
 */
public class Nissan extends Car{
    public Nissan(String name, int cylinders) {
        super(name, true, cylinders, 4);
    }



    @Override
    public int accelerate(int speed) {
        int distance = speed + super.getDistance();
        System.out.println(super.getName() + " is going " + speed + "mph and has traveled " + distance + " miles.");
        return distance;
    }

    @Override
    public int brake() {
        return super.brake();
    }


}
