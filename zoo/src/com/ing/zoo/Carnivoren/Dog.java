package com.ing.zoo.Carnivoren;

import com.ing.zoo.Soort;

import java.util.Random;

public class Dog implements Soort.Carnivore {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;


    public void sayHello() {
        helloText = "waffff";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "Werrrrry tasty!";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "runs in circles waving his tail";
        } else {
            trick = "doing the jumping jacks with his ears";
        }
        System.out.println(trick);
    }
}
