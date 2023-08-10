package com.Hero;

public abstract class Hero {
    protected String name; // hanya bisa di akses oleh subsclass dari Hero
    private int level;
    public Hero(String name){
        this.name = name;
    }

    public abstract void display();

    public String getName(){
        String str = "name : " + this.name + "-" + this.level;
        return str;
    }

    protected void setName(String name){
        this.name = name;
    }

}
