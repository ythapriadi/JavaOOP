package com.tutorial;

public class Main{
    public static void main(String[] args) {

        Hero hero1 = new Hero();
        hero1.name = "YTH";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Kuteki";
        hero2.defensePower = 100;
        hero2.display();
        
        
    }
}