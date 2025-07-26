package com.example.model1.task2.transport;

import com.example.model1.task2.interfaces.CargoTransport;
import com.example.model1.task2.interfaces.PropellerDriven;
import com.example.model1.task2.interfaces.Wheeled;
import com.example.model1.task2.model.TransportVehicle;

public class Helicopter extends TransportVehicle implements Wheeled, PropellerDriven, CargoTransport
{

    @Override
    public void conclusion() {
        this.cargo();
        this.screw();
        this.wheel();
    }

    @Override
    public void cargo()
    {
        System.out.println("Вертолет перевозит груз по воздуху");
    }

    @Override
    public void screw()
    {
        System.out.println("С помощью винтов, вертолет взлетает");
    }

    @Override
    public void wheel()
    {
        System.out.println("Некоторые модели вертолетов имеют колеса");
    }
    
}
