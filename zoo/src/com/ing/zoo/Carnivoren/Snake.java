package com.ing.zoo.Carnivoren;

import com.ing.zoo.Soort;

import java.util.Random;

public class Snake implements Soort.Carnivore {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Snake() {
    }

    public void sayHello() {
        helloText = "I am a ssssssssssssake";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "ssssss tassssssssssssssty";
        System.out.println(eatText);
    }
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "swinging around";
        } else {
            trick = "singing";
        }
        System.out.println(trick);
    }
}
