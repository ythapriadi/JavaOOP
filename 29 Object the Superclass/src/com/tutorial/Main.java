package com.tutorial;

public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero("YTH");
        hero1.display(); 

        //kita sebut class object sebagai superclass
        Object hero2 = hero1;

        String hero2_str = hero2.toString();
        String hero1_str = hero1.toString();
        System.out.println(hero1_str);
        System.out.println(hero2_str);

        //salah satu method dari class object adalah equals
        System.out.println(hero1.equals(hero2));

        //contoh dari equals
        Hero hero3 = new Hero("Kuteki");
        Hero hero4 = new Hero("Kuteki");
        Hero hero5 = new Hero("Kuteki");

        Jagoan hero6 = new Jagoan("Kuteki");

        System.out.println(hero3.equals(hero4));

        //Override equals di class Hero
         System.out.println(hero3.equals(hero4));
         System.out.println(hero3.equals(hero1));
    }
}