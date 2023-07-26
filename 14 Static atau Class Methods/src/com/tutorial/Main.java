package com.tutorial;

import java.util.ArrayList;

class Player{
    private static int numberOfPlayer;
    private static ArrayList <String> nameList = new ArrayList<>();

    private String name;


    Player (String name){
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    void show(){
        System.out.println("Player Name = " + this.name);
    }

    //Static methods
    static void showNumberOfPlayer(){
        System.out.println("Number of Player" + Player.numberOfPlayer);
    }

    static ArrayList<String> getNames(){
        return Player.nameList;
    }
}


public class Main {
    public static void main(String[] args) {
        
        Player player1 = new Player("Saitama");
        Player player2 = new Player("Deku");
        Player player3 = new Player("Midnight");
        Player player4 = new Player("MT Lady");

        Player.showNumberOfPlayer();
        System.out.println("Names = " + Player.getNames());
        // System.out.println("Names = " + player1.getNames()); //ini bisa dilakukan
        
    }
}
