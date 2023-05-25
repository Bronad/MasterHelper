package com.example.meisters_mittel;

import java.util.concurrent.ThreadLocalRandom;

enum Rassen{Mensch, Elf, Zwerg, Halbling, Gnome};

enum Geschlecht{Männlich, weiblich, divers, egal};

public class nameing {

    public Rassen randomr(){

        int ar = Rassen.values().length;
        int r = ThreadLocalRandom.current().nextInt(0, ar);

        return Rassen.values()[r];
    };

    public Geschlecht ramdomg(){
        int ar = Geschlecht.values().length;
        int r = ThreadLocalRandom.current().nextInt(0, ar);

        return Geschlecht.values()[r];
    }

}
