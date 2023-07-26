package com.tutorial;

//keyword import untuk package eksternal
import com.terminal.Console;

class Main{
    public static void main(String[] args) {
       
        Player player1 = new Player("YTH");
        Player player2 = new Player("Zabuton");
        Player player3 = new Player("Kuteki");
        player1.show();
        player2.show();
        player3.show();

        Console.log("Hallo");

    }
}