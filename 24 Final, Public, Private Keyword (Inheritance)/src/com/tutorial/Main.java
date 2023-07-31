package com.tutorial;


//visibility
//Public : 1. jika method atau attribute dalam public secara eksplisit,
//            maka subsclass tidak boleh mengurangi visibility
//Private : 2. jika attribut atau method dalam private secara eksplisit,
//             maka subslacc pun tidak dapat mengakses
//Final : 3. method atau attribut dengan final keyword akan diwariskan,
//           tetapi tidak bisa di override atau ditimpa, dalam class yang sama bisa di overload

public class Main{
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("YTH", 100);
        IntelHero hero2 = new IntelHero("Kuteki", 100);

        hero1.display();
        hero2.display();

        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());

        hero1.setHealth(150);
        hero2.setHealth(200);

        hero1.display();
        hero2.display();

        hero1.setHealth("reset");
        hero1.display();

        hero2.setHealth("reset");
        hero2.display();
    }
}