package com.tutorial;

//this.name akan mengakses atribut name kalau ada Class ini
//jika tidak ada maka akan diakses dari superclass

// super.name akan selalu mengakses atribut superclass

public class HeroStrength extends Hero {
    
    String name = "Class Strength";

    void display(){
        System.out.println("Ini adalah " + this.name);
        this.dummyMethod();
    }
    void displaySuper(){
        System.out.println("Ini adalah " + super.name);
        super.dummyMethod();
    }
    void dummyMethod(){
        System.out.println("Method ini ada di sub class");
    }

}
