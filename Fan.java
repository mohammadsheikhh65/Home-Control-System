package com.controlsystem.model;

public class Fan extends Appliance {
    private int speed = 1;

    @Override
    public void switchOff() {
        speed = 0;
        System.out.println("Fan turned off (speed = " + speed + ")");
    }
}
