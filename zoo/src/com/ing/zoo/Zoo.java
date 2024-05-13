package com.ing.zoo;

import com.ing.zoo.Carnivoren.Dog;
import com.ing.zoo.Carnivoren.Lion;
import com.ing.zoo.Carnivoren.Snake;
import com.ing.zoo.Carnivoren.Tiger;
import com.ing.zoo.Circusdieren.Pig;
import com.ing.zoo.Herbivoren.Hippo;
import com.ing.zoo.Herbivoren.Zebra;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Dog robbie = new Dog();
        robbie.name = "robbie";
        Snake sourcy = new Snake();
        sourcy.name = "sourcy";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine().trim();

        //Validatie commando
        boolean valideerCommando = false;
        for (String commando : commands) {
            //Begint met een commando, geef dan de commando weer (hello, give leaves)
            if (input.contains(commando)) {
                valideerCommando = true;
                break;
            }
        }

        if (valideerCommando) {
            switch (input) {
                case "hello":
                    System.out.print("Voer de naam van het dier in: ");
                    String name = scanner.nextLine().trim().toLowerCase();
                    greetings(name, henk, elsa, dora, wally, marty, robbie, sourcy);
                    break;
                case "give leaves":
                    elsa.eatLeaves();
                    marty.eatLeaves();
                    break;
                case "give meat":
                    henk.eatMeat();
                    wally.eatMeat();
                    robbie.eatMeat();
                    sourcy.eatMeat();
                    break;
                case "perform trick":
                    performTricks(dora, wally, marty, robbie, sourcy);
                    break;
                default:
                    System.out.println("Unknown command: " + input);
                    break;
            }
        } else {
            System.out.println("Unknown command: " + input);
        }
    }

    private static void greetings(String name, Lion henk, Hippo elsa, Pig dora, Tiger wally, Zebra marty, Dog robbie, Snake sourcy) {
        switch (name.toLowerCase()) {
            case "henk":
                henk.sayHello();
                break;
            case "elsa":
                elsa.sayHello();
                break;
            case "dora":
                dora.sayHello();
                break;
            case "wally":
                wally.sayHello();
                break;
            case "marty":
                marty.sayHello();
                break;
            case "robbie":
                robbie.sayHello();
                break;
            case "sourcy":
                sourcy.sayHello();
                break;
            default:
                System.out.println("Unknown name: " + name);
        }
    }

    private static void performTricks(Pig dora, Tiger wally, Zebra marty, Dog robbie, Snake sourcy) {
        if (dora instanceof Pig) {
            dora.performTrick();
        }
        if (wally instanceof Tiger) {
            wally.performTrick();
        }
        if (marty instanceof Zebra) {
            marty.performTrick();
        }
        if (robbie instanceof Dog) {
            robbie.performTrick();
        }
        if (sourcy instanceof Snake) {
            sourcy.performTrick();
        }
    }
}