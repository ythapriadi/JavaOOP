package com.tutorial;

// Inheritance adalah hubungan untuk is_a

//Superclass, parent class, base class
class Hero{
    String name;

    //method
    void display(){
        System.out.println("Name : " + this.name);
    }
}

//subsclass, child class, derived class
class heroStrength extends Hero{
    //Hampa atau kosong
    //Melakukan extend dengan mengambil atribut dari class hero
}

class heroIntelligent extends Hero{
     //Hampa atau kosong
}

public class Main{
    public static void main(String[] args) {

        Hero hero1 = new Hero();
        hero1.name = "YTH";
        hero1.display();
        
        heroStrength hero2 = new heroStrength();
        hero2.name = "Kuteki";
        hero2.display();

        heroIntelligent hero3 = new heroIntelligent();
        hero3.name = "Zabuton";
        hero3.display();
        
    }
}