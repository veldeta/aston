package com.example.model1.task2.transport;

import com.example.model1.task2.interfaces.CargoTransport;
import com.example.model1.task2.interfaces.PropellerDriven;
import com.example.model1.task2.interfaces.Wheeled;
import com.example.model1.task2.interfaces.Winged;
import com.example.model1.task2.model.TransportVehicle;

public class Airplane extends TransportVehicle implements Wheeled, Winged, PropellerDriven, CargoTransport
{
    @Override
    public void conclusion() {
        this.cargo();
        this.screw();
        this.wing();
        this.wheel();
    }

    @Override
    public void cargo()
    {
        System.out.println("Самолет перевозит груз по воздуху.");
    }

    @Override
    public void screw()
    {
        System.out.println("У самолета есть винты.");
    }

    @Override
    public void wing()
    {
        System.out.println("Самолет взлетает с помощью крыльев.");
    }

    @Override
    public void wheel()
    {
        System.out.println("Шосси для взлета и посадки.");
    }
}
