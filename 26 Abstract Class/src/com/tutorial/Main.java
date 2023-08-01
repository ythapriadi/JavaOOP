package com.tutorial;

import com.hero.HeroIntel;
import com.hero.HeroAgility;

public class Main {
    public static void main(String[] args) {
        
        //membuat object dari class non abstract
        HeroIntel hero1 = new HeroIntel("Kuteki");
        hero1.display();

        HeroAgility hero2 = new HeroAgility("YTH");
        hero2.display();
    
        //membuat object dari kelas abstract
        // Hero hero3 = new Hero ("mario");
        // hero2.display();
    }
}
