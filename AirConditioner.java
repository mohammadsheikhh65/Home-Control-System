package com.controlsystem.model;

public class AirConditioner extends Appliance {
    private String mode = "cool";

    @Override
    public void switchOff() {
        mode = "off";
        System.out.println("Air Conditioner turned off (mode = " + mode + ")");
    }
}
