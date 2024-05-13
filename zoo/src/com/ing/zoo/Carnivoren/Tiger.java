package com.ing.zoo.Carnivoren;

import com.ing.zoo.Soort;

import java.util.Random;

public class Tiger implements Soort.Carnivore {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Tiger() {
    }

    public void sayHello() {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
