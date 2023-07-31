package com.tutorial;

public class Hero {
    public String name;
    private double health;

    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    //getter
    public double getHealth(){
        return this.health;
    }

    //setter
    final void setHealth(double newHealth){
        this.health = newHealth;
    }

    //bisa di overload
    void setHealth(String mode){
        if (mode.equals("reset")){
            this.health = 100;
        }
    }

    public void display(){
        // System.out.println("Nama    : " + this.name);
        // System.out.println("Health  : " + this.health);
        System.out.println("\n" + this.name + " Mempuanyai " + this.health + " HP");
    }

}
