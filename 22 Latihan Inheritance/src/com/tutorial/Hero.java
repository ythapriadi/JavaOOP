package com.tutorial;

public class Hero{
    //atribute
    String name;
    double attackPower, health;

    //contructor
    Hero(String nameInput, double attackInput, double healthInput){
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    //method attck
    void attack(Hero enemy){
        System.out.println("\n" + this.name + " Attack " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }

    void takeDamage(double damage){
        System.out.println(this.name + " receive damage " + damage);
        this.health = this.health - damage;
    }

    void display(){
        System.out.println("\nName         : " + this.name);
        System.out.println("Health       : " + this.health);
        System.out.println("Attack Power : " + this.attackPower);
    }
}