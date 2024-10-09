package com.example.mimshakex2;

public class Drum implements Playable{
    @Override
    public void play(){
        System.out.println("The drum makes bass sounds.");
    }
    public void size(){
        System.out.println("The drum is huge.");
    }
}
