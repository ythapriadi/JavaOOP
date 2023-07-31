package com.tutorial;

public class IntelHero extends Hero{


    IntelHero(String name, double health){
        super(name, health);
        // System.out.println(this.health); tidak bisa diakses karena private
    }
    

    //override getHealth
    //karena di superclass method public, maka di subclass harus public
    // public double getHealth(){
    //     return this.health; //ini tidak bisa
    // }

    //visibility harus sama dengan superclass
    public void display(){
        System.out.println(this.name + " Mempunyai " + this.getHealth());
    }

    //kita mencoba override final setter, tidak bisa dilakukan
    // void setHealth(double newHealth){
    //     System.out.println("Mencoba memasukkan Health = " + newHealth);
    // }

    //ini bida dilakukan
    void setHealth(String newHealth){
        System.out.println("Mencoba memasukkan Health = " + newHealth);
    }
}
