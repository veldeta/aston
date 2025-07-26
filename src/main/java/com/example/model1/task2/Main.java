package com.example.model1.task2;

import com.example.model1.task2.model.TransportVehicle;
import com.example.model1.task2.transport.Airplane;
import com.example.model1.task2.transport.Helicopter;
import com.example.model1.task2.transport.Speedboat;
import com.example.model1.task2.transport.Tanker;
import com.example.model1.task2.transport.Taxi;
import com.example.model1.task2.transport.Truck;

public class Main {

    public static void main(String[] args) {
        TransportVehicle[] transports = {
            new Airplane(),
            new Helicopter(),
            new Speedboat(),
            new Tanker(),
            new Taxi(),
            new Truck()
        };

        for (TransportVehicle transport : transports) {
            transport.name();
            transport.conclusion();
            System.out.println();
        }
    }
}
