package com.tutorial;

public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero("YTH");
        HeroStrength hero2 = new HeroStrength("Kuteki");
        // HeroIntelligent hero3 = new HeroIntelligent("Zabuton");
        // HeroAgility hero4 = new HeroAgility("Kuro");

        hero1.display();
        hero2.display();

        //polymorphic
        Hero hero3 = new HeroAgility("riki");
        hero3.display();

        HeroAgility hero4 = new HeroAgility("Viper");
        hero4.display();
        hero4.showOff();

        //tidak bisa
        // HeroIntelligent hero4 = new Hero("Maiden");
        // hero4.display();

        //Array List
        Hero[] kumpulanHero = new Hero [4];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4;

        kumpulanHero[0].display();
        kumpulanHero[1].display();
        kumpulanHero[2].display(); 

        //method call
        // kumpulanHero[3].showOff; tidak bisa

        //aplikaso
        hero1.attack(hero4);
        hero2.attack(hero3);

    }
}