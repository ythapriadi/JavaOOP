package com.tutorial;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero("YTH", 100);
        Hero hero2 = new Hero("Kuteki", 100);
        AgilityHero heroAgility = new AgilityHero("Viper", 150);
        IntelHero heroIntel = new IntelHero("Lina", 100);

        ArrayList<Hero> listHero = new ArrayList<>();

        //Operasi 1 : menambah member dengan add
        System.out.println("Operasi 1 : add");
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(heroAgility);
        
        System.out.println(listHero);
        System.out.println();
        
        //operasi 2 : merubah member dengan set
        System.out.println("Operasi 2 : set");
        listHero.set(2, heroIntel);
        System.out.println(listHero);
        System.out.println();

        //operasi 3 : menghapus member dengan remove
        System.out.println("Operasi 3 : remove");
        listHero.remove(2);
        System.out.println(listHero);
        System.out.println();

        //operasi 4 : mengakses member
        System.out.println("Operasi 4 : get");
        System.out.println(listHero);
        Hero heroAmbil = listHero.get(0);
        System.out.println(listHero);
        System.out.println();
        heroAmbil.display();
        System.out.println();

        //method pada arraylist
        System.out.println("Method2");
        System.out.println("1. size()\t : " + listHero.size());
        System.out.println("2. isEmpty()\t : " + listHero.isEmpty());
        System.out.println("3. containts(hero2)\t : " + listHero.contains(hero2));
        System.out.println("   containts(heroIntel)\t : " + listHero.contains(heroIntel));
        System.out.println("4. indexOf(hero1) " + listHero.indexOf(hero1));
        System.out.println("   indexOf(heroAgility) " + listHero.indexOf(heroAgility));
    }
}