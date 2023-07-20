package com.tutorial;

class Player{
    String name; //Default, dia akan bisa dibaca atau ditulis dari luar kelas
    public int exp; //Public, dia akan bisa dibaca dan ditulis dari luar kelas
    private int health; //Private, hanya akan bisa dibaca dan ditulis di dalam class saja 
    
    Player(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    //default modifier akses
    void display(){
        tambahExp(); //contoh meakses private methods
        System.out.println("\nName\t : " + this.name);
        System.out.println("EXP\t : " + this.exp);
        System.out.println("Health\t : " + this.health); //membaca tapi didalam class
    }

    //public
    public void ubahName(String nameBaru){
        this.name = nameBaru;
    }

    //private
    private void tambahExp(){
        this.exp += 100;
    }
    

}

public class Main {

    public static void main(String[] args) {
        
        Player player1 = new Player("Marni",0,100);

        //Default
        System.out.println(player1.name); //membaca data
        player1.name = "surti";           //Menulis data
        System.out.println(player1.name);//membaca data

        //Public
        System.out.println(player1.exp); //membaca data
        player1.exp = 100;               //Menulis data
        System.out.println(player1.exp);//membaca data

        //Private <----------Tidak bisa diakses
        // System.out.println(player1.health); //membaca data
        // player1.health = 100;                  //Menulis data
        // System.out.println(player1.health);//membaca data
   
        //default
        player1.display();

        //public
        player1.ubahName("toji");
        player1.display();

        //private (tidak bisa diakses dari luar)
        // player1.tambahExp();
    }
}
