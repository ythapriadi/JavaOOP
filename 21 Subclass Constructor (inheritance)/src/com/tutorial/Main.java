package com.tutorial;


public class Main{
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("YTH", 10); //ini memakai contructor superclass
        hero1.display();

        HeroStrength hero2 = new HeroStrength("Kuteki",10);
        hero2.display();

        HeroStrength hero3 = new HeroStrength("Zabuton");
        hero3.display();
    }
}