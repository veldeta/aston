package com.example.model1.task2.transport;

import com.example.model1.task2.interfaces.CargoTransport;
import com.example.model1.task2.interfaces.PropellerDriven;
import com.example.model1.task2.interfaces.Wheeled;
import com.example.model1.task2.interfaces.Winged;
import com.example.model1.task2.model.TransportVehicle;

public class Airplane extends TransportVehicle implements Wheeled, Winged, PropellerDriven, CargoTransport
{
    public static void main(String[] args) {
        System.out.println("Самолет " + Wheeled.wheel + ", " + Winged.wing + ", " + PropellerDriven.screw + ", " + CargoTransport.cargo);
    }
}
