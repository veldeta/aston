package com.example.model1.task1.animal;

import com.example.model1.task1.interfaces.Aquatic;
import com.example.model1.task1.model.Animal;

public class Fish extends Animal implements Aquatic {

    @Override
    public void describe()
    {
        System.out.println("Я - Рыба.");
    }
    
    @Override
    public void liveInWater()
    {
        System.out.println("Рыба живёт в воде.");
    }
}
