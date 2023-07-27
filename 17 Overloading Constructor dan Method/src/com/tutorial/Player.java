package com.tutorial;

public class Player {
    private String name;

    //overloading contructor
    //Opsi 1
    Player(String name){
        this.name = name;
    }

    Player(){
        this.name = "Player";
    }

    void show(){
        System.out.println("Name : " + this.name);
    }
}
