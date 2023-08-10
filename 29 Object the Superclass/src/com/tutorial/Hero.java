package com.tutorial;

public class Hero extends Object{
    private String name;

    public Hero(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("\nName : " + this.name);
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){
            System.out.println("object dengan reference sama");
            return true;
        }else if (this.getClass() == otherObject.getClass()){
            System.out.println("object dengan class sama");
            System.out.println("reference berbeda");

            Hero other = (Hero) otherObject;
            if(this.name == other.name){
                System.out.println("namanya sama");
                return true;
            }else{
                System.out.println("Namanya beda");
                return false;
            }
        }else{
            return false;
        }
    }
}
