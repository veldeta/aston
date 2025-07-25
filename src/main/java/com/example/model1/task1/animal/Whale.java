package com.example.model1.task1.animal;

import com.example.model1.task1.interfaces.Aquatic;
import com.example.model1.task1.model.Mammal;

public class Whale extends Mammal implements Aquatic {

    @Override
    public void describe()
    {
        System.out.println("Я - Кит.");
    }

    @Override
    public void liveInWater()
    {
        System.out.println("Кит живёт в воде.");
    }
}