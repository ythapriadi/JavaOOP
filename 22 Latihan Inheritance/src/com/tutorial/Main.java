package com.tutorial;


public class Main{
    public static void main(String[] args) {

        Hero hero1 =new Hero("YTH",10,100);
        HeroStrength hero2 = new HeroStrength("Kuteki", 15, 100);

        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);

        hero1.display();
        hero2.display();
        
    }
}