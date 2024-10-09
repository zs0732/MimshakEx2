package com.example.mimshakex2;

public class Main {
    public static void main(String[] args) {

        Playable[] play = new Playable[3];
        play[0] = (new Drum());
        play[1] = (new Piano());
        play[2] = (new Guitar());

        for (Playable creature : play) {
            creature.play();
        }

    }
}
