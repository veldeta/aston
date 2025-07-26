package com.example.model1.task1.model;

import com.example.model1.task1.interfaces.Vertebrate;

public abstract class Mammal extends Animal implements Vertebrate{

    @Override
    public void hasSpine()
    {
        System.out.println(this.getClass().getSimpleName() + " имеет позвоночник.");
    }
}
