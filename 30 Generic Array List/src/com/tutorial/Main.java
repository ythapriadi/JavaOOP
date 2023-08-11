package com.tutorial;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("YTH", 100);
        Hero hero2 = new Hero("Kuteki", 90);
        AgilityHero agilityHero = new AgilityHero("Zabuton", 80);
        IntelHero intelHero = new IntelHero("Nonbiri", 50);

        //array sederhana
        Hero[] kumpulanHero = new Hero[3];

        //Masukkan anggota
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = agilityHero;
        // kumpulanHero[3] = intelHero; karena array fiks 
        
        for(Hero hero:kumpulanHero){
            hero.display();
        }

        
        //Array List
        ArrayList<Hero> listHero = new ArrayList<Hero>();
        
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(agilityHero);
        listHero.add(intelHero);

        System.out.println("\nArrayList\n");
        for(Hero hero:listHero){
            hero.display();
        }

        //reference
        agilityHero.setName("LOA");

        System.out.println("\nArray\n");
        for(Hero hero:kumpulanHero){
            hero.display();
        }

    }
}