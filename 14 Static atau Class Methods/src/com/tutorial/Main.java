package com.tutorial;

class Player{
    static int numberOfPlayer;
    private String name;


    Player (String name){
        this.name = name;
        Player.numberOfPlayer++;
    }

    void show(){
        System.out.println("Player Name = " + this.name);
    }

    //Static methods
    static void showNumberOfPlayer(){
        System.out.println("Number of Player" + Player.numberOfPlayer);
    }
}


public class Main {
    public static void main(String[] args) {
        
        Player player1 = new Player("Saitama");
        Player player2 = new Player("Deku");

        player1.show();
        player2.show();

        Player.showNumberOfPlayer();
        
    }
}
