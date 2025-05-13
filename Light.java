package com.controlsystem.model;

public class Light extends Appliance {
  private String switchDirection = "on";

  @Override
    public void switchOff() {
        switchDirection = "off";
        System.out.println("Light turned off (switch = " + switchDirection + ")");
    }
}
