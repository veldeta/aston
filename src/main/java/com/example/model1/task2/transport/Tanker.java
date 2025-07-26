package com.example.model1.task2.transport;

import com.example.model1.task2.interfaces.CargoTransport;
import com.example.model1.task2.interfaces.PropellerDriven;
import com.example.model1.task2.model.TransportVehicle;

public class Tanker extends TransportVehicle implements PropellerDriven, CargoTransport {

    @Override
    public void conclusion() {
        this.cargo();
        this.screw();
    }

    @Override
    public void cargo() {
        System.out.println("Танкер перевозит груд по воде, из-за того что он танкер. Он груз может вместить в себя в несколько тонн");
    }

    @Override
    public void screw() {
        System.out.println("У танкера большие и мощьные пробелеры чтобы его толкать по воде");
    }
}
