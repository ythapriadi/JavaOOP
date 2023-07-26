package com.tutorial;

class Display{

    static String type = "Display";

    private String name;

    Display (String name){
        this.name = name;
    }

    void setType(String typeInput){
        // type = typeInput; //Alternatif 1
        // this.type = typeInput; //Alternatif 2
        Display.type = typeInput; // Alternatif 3
    }

    void show(){
        System.out.println("Display name = " + this.name);
    }
}




public class Main {
    public static void main(String[] args) {
        
        Display display1 = new Display("Monitor");
        display1.show();

        Display display2 = new Display("Smartphone");
        display2.show();

        //tampilkan static variabel
        display1.setType("monitor");
        
        System.out.println("Menampilkan static variabel");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);

    }
}
