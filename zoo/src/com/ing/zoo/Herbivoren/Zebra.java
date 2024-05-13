package com.ing.zoo.Herbivoren;

import com.ing.zoo.Soort;

import java.util.Random;

public class Zebra implements Soort.Herbivore {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra() {
    }

    public void sayHello() {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "counts his steps";
        } else {
            trick = "runs step by step";
        }
        System.out.println(trick);
    }
}
