package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //Overloading pada constructor
        Player player1 = new Player("YTH");
        Player player2 = new Player();

        player1.show();
        player2.show();
        
    }
}