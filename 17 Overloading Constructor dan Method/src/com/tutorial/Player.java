package com.tutorial;

public class Player {
    private String name;
    private static int jumlahPlayer;

    //overloading contructor
    //Opsi 1
    Player(String name){
        Player.jumlahPlayer++;
        this.name = name;
    }

    Player(){
        Player.jumlahPlayer++;
        this.name = "Player" + Player.jumlahPlayer;
    }

    void show(){
        System.out.println("Name : " + this.name);
    }
}
