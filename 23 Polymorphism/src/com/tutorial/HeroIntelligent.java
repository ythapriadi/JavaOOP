package com.tutorial;

public class HeroIntelligent extends Hero{
    String type = "Intelligent";

    HeroIntelligent(String nama){
        super(nama);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type    : " + this.type);
    }
    
}
