package com.tutorial;

// Inheritance adalah hubungan untuk is_a

//Superclass, parent class, base class
class Hero{
    String name;

}

//subsclass, child class, derived class
class heroStrength extends Hero{
    //Hampa atau kosong
    //Melakukan extend dengan mengambil atribut dari class hero
}

class heroIntelligent extends Hero{

}

public class Main{
    public static void main(String[] args) {

        Hero hero1 = new Hero();
        hero1.name = "YTH";
        System.out.println("Hero 1 : " + hero1.name);
        
        heroStrength hero2 = new heroStrength();
        hero2.name = "Kuteki";
        System.out.println("Hero 2 : " + hero2.name);

        heroIntelligent hero3 = new heroIntelligent();
        hero3.name = "Zabuton";
        System.out.println("Hero 3 : " + hero3.name);
        
    }
}