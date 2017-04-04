package com.AE;

/**
 * Created by Angel on 11/12/16.
 */
public class GM extends Car{
    public GM(String name,  int cylinders) {
        super(name, true, cylinders, 4);


    }

    @Override
    public int accelerate(int speed) {
        return super.accelerate(speed);
    }

    @Override
    public int brake() {
        return super.brake();
    }
}
