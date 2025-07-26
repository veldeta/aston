package com.example.model1.task2.transport;

import com.example.model1.task2.interfaces.Wheeled;
import com.example.model1.task2.model.TransportVehicle;

public class Taxi extends TransportVehicle implements Wheeled {

    @Override
    public void conclusion() {
        this.wheel();
    }

    @Override
    public void wheel() {
        System.out.println("Машина производит движение с помощью колес");
    }
}
