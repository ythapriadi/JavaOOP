package com.tutorial;

import com.hero.HeroIntel;
import com.hero.HeroStrength;
import com.hero.HeroAgility;

public class Main{
    public static void main(String[] args) {
        HeroIntel hero1 = new HeroIntel("Kuteki");
        hero1.display();

        HeroAgility hero2 = new HeroAgility("YTH");
        hero2.display();

        hero1.levelUp();
        hero2.levelUp();
        
        hero1.display();
        hero2.display();

        HeroStrength hero3 = new HeroStrength("Zabuton");
        hero3.display();
        hero3.levelUp();
        hero3.display();
    }
}