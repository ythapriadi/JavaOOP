package com.tutorial;

import com.terminal.Console;

//Visibility Default
public class Player {
    private String name;

    Player (String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void show(){
        // System.out.println("Player Name  = " + this.name);
        Console.log("Menggunakan Console");
        Console.log("Player Name  : " + this.name);
    }
    
}
