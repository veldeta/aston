package com.example.model1.task1;

import com.example.model1.task1.animal.Bear;
import com.example.model1.task1.animal.Cat;
import com.example.model1.task1.animal.Fish;
import com.example.model1.task1.animal.Whale;
import com.example.model1.task1.interfaces.Aquatic;
import com.example.model1.task1.interfaces.HasFur;
import com.example.model1.task1.model.Animal;
import com.example.model1.task1.model.Mammal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
            new Cat(),
            new Bear(),
            new Whale(),
            new Fish()
        };

        for (Animal animal : animals) {
            animal.describe();

            if (animal instanceof Mammal mammal ) {
                mammal.hasSpine();
            }
            

            if (animal instanceof HasFur hasFur) {
                hasFur.hasFur();
            }
            
            if (animal instanceof Aquatic aquatic) {
                aquatic.liveInWater();
            }

            System.out.println();
        }
    }
}