package com.example.model1.task1.animal;

import com.example.model1.task1.interfaces.HasFur;
import com.example.model1.task1.model.Mammal;

public class Cat extends Mammal implements HasFur {

    @Override
    public void describe()
    {
        System.out.println("Я - кошка.");
    }

    @Override
    public void hasFur()
    {
        System.out.println("Кошка имеет шерсть.");
    }
}
