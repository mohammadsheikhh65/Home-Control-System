package com.controlsystemapp;

import com.controlsystem.model.AirConditioner;
import com.controlsystem.model.Fan;
import com.example.controlsystem.model.Light;
import com.example.controlsystem.service.ControlSystem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ControlSystemApp {

    public static void main(String[] args) {
        SpringApplication.run(ControlSystemApp.class, args);
    }

  
    @org.springframework.context.annotation.Bean
    public CommandLineRunner initializeDevices(ControlSystem controlSystem) {
        return args -> {
            controlSystem.addAppliance(new Light());
            controlSystem.addAppliance(new Fan());
            controlSystem.addAppliance(new AirConditioner());

            // to test
            controlSystem.shutDownAll();
        };
    }
