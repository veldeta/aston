package com.example.model1.task1.animal;

import com.example.model1.task1.interfaces.HasFur;
import com.example.model1.task1.model.Mammal;

public class Bear extends Mammal implements HasFur {

    @Override
    public void describe()
    {
        System.out.println("Я - Медведь.");
    }

    @Override
    public void hasFur()
    {
        System.out.println("Медведь имеет шерсть.");
    }
}
