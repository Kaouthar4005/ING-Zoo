package com.ing.zoo.Herbivoren;

import com.ing.zoo.Soort;

public class Hippo implements Soort.Herbivore {
    public String name;
    public String helloText;
    public String eatText;

    public Hippo() {
    }

    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
