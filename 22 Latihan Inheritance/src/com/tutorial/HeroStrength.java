package com.tutorial;

public class HeroStrength extends Hero{

    String type = "Strength";
    //subclass
    //contructor
    HeroStrength(String nameInputt, double attackInput, double healthInput){
        super(nameInputt, attackInput, healthInput);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type\t   : " + this.type);
    }

    @Override
    void takeDamage(double damage){
        System.out.println(this.name + " receive damage " + damage + " ---> " + 0.5 * damage);
        this.health = this.health - 0.5 * damage;
    }
}
