package com.tutorial;

public class Hero {
    //attribut
    String name;
    double defensePower;

    //contructor
    Hero(String name, double defensePower){
        this.name = name;
        this.defensePower = defensePower;
    }

    Hero (String name){
        this.name = name;
    }
    
    //method
    void display(){
        System.out.println("Hero name : " + this.name);
    }
    
}
