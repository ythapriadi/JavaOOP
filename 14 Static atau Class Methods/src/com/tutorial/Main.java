package com.tutorial;

class Player{
    private String name;


    Player (String name){
        this.name = name;
    }


    void show(){
        System.out.println("Player Name = " + this.name);
    }
}


public class Main {
    public static void main(String[] args) {
        
        Player player1 = new Player("Saitama");
        Player player2 = new Player("Deku");

        player1.show();
        player2.show();
    }
}
