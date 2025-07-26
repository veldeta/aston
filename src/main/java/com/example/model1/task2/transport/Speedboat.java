package com.example.model1.task2.transport;

import com.example.model1.task2.interfaces.CargoTransport;
import com.example.model1.task2.interfaces.PropellerDriven;
import com.example.model1.task2.model.TransportVehicle;

public class Speedboat extends TransportVehicle implements PropellerDriven, CargoTransport {

    @Override
    public void conclusion() {
        this.cargo();
        this.screw();
    }

    @Override
    public void cargo() {
        System.out.println("Катер перевозит груз по воде");
    }

    @Override
    public void screw() {
        System.out.println("Пропелеры толкают катер в перед");
    }
}
