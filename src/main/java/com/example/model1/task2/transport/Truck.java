package com.example.model1.task2.transport;

import com.example.model1.task2.interfaces.CargoTransport;
import com.example.model1.task2.interfaces.Wheeled;
import com.example.model1.task2.model.TransportVehicle;

public class Truck extends TransportVehicle implements CargoTransport, Wheeled{

    @Override
    public void conclusion() {
        this.wheel();
        this.cargo();
    }

    @Override
    public void wheel() {
        System.out.println("Совершает движение с помощью колес");
    }

    @Override
    public void cargo() {
        System.out.println("Перевозит груз");
    }
}
