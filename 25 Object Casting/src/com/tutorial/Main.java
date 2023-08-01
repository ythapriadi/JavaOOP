package com.tutorial;

public class Main{
    public static void main(String[] args) {
        
        //Object dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("YTH",100);
        hero1.display();
        hero1.castMagic();

        //Up casting
        Hero heroUp = (Hero) hero1;

        heroUp.display();

        //ada field dan method yang hilang
        // System.out.println(heroUp.type);
        // heroUp.castMagic

        Hero heroReg = new Hero("Kuteki", 100);
        heroReg.display();

        //down casting dari superclass ke subclass
        // HeroAgility heroDown = (HeroAgility) heroReg;
        // heroDown.display(); 

        //coba dari intel ke hero biasa lalu dibalikan ke intel
        HeroIntel hero2 = (HeroIntel) heroUp;

        //berhasil di downcasting dengan syarat bentul awalnya adalah sama
        hero2.display();
        System.out.println(hero2.type);
        hero2.castMagic();
    }
}