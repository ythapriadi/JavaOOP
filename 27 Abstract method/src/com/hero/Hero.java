package com.hero;

public abstract class Hero {
    private String name;
    private int level;

    public Hero (String name){
        this.name = name;
        this.level = 1;
    }

    public void display(){
        System.out.println("Aku adalah " + this.name);
        System.out.println("Level " + this.level);
    }

    //asbtract method
    public abstract void levelUp();

    //setter
    public void setLevel(int deltaLevel){
        this.level += deltaLevel;
    }
    
}
