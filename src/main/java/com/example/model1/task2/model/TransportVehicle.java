package com.example.model1.task2.model;

public abstract class TransportVehicle {

    public void name()
    {
        System.out.println(this.getClass().getSimpleName());
    }

    public abstract void conclusion();

}
