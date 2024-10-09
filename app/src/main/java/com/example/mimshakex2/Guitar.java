package com.example.mimshakex2;

public class Guitar implements Playable{
    @Override
    public void play(){
        System.out.println("The guitar plays calm sounds when it's acoustic and loud when it's electric.");
    }
    public void typeOfGuitar(){
        System.out.println("This guitar is electric.");
    }

}
