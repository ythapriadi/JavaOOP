package com.tutorial;

// Inheritance adalah hubungan untuk is_a


public class Main{
    public static void main(String[] args) {

        Hero hero1 = new Hero();
        hero1.name = "YTH";
        hero1.display();
        
        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Kuteki";
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Zabuton";
        hero3.display();
        
    }
}