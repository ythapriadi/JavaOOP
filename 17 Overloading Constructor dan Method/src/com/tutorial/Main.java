package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //Overloading pada constructor
        Player player1 = new Player("YTH");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Kuteki");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        //Overloading methods
        int a = Matematika.tambah(7, 3);
        System.out.println(a);

        double b = Matematika.tambah(1,0.5);
        System.out.println(b);
        
    }
}