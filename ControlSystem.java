package com.controlsystem.service;

import com.example.controlsystem.model.Appliance;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class ControlSystem {

    private final List<Appliance> appliances = new CopyOnWriteArrayList<>();

    public void addAppliance(Appliance appliance) {
        if (appliance != null) {
            appliances.add(appliance);
        }
    }

    public void shutDownAll() {
        System.out.println("Initiating shutdown sequence for all appliances...");
        appliances.forEach(Appliance::turnOff);
    }

    @Scheduled(cron = "0 0 1 1 1 *")
    public void yearlyMaintenance() {
        System.out.println("Performing scheduled yearly maintenance: Jan 1st, 1:00 AM.");
        shutDownAll();
    }

    
 
}
