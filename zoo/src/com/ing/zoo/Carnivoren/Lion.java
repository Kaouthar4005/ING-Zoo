package com.ing.zoo.Carnivoren;

import com.ing.zoo.Soort;

public class Lion implements Soort.Carnivore {
    public String name;
    public String helloText;
    public String eatText;

    public Lion() {
    }

    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
