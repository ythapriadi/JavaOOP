package com.tutorial;

class Data{
    public  int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 10;
    }

    void display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }

    //GETTER
    public int getIntPrivate(){
        return this.intPrivate;
    }
    
    //SETTER
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
}

class Lingkaran{
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    //setter
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    //getter
    public double getJari2(){
        return this.diameter/2;
    }

    //getter
    public double getLuas(){
        return 3.14*diameter*diameter/2;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Data object = new Data();

        //public

        //read and write menggunakan public
        object.intPublic = 5; //write
        System.out.println("PUBLIC : " + object.intPublic); //read

        //read only (Menggunakan GETTER)
        int angka  = object.getIntPrivate();
        System.out.println("GETTER : " + angka);

        //write only (Menggunakan SETTER)
        object.setDoublePrivate(0.05);
        object.display();

        //Menggabungkan read dan write dengan setter dan getter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println("Jari jari : " + object2.getJari2());
        object2.setJari2(14);
        System.out.println("Jari jari : " + object2.getJari2());
        System.out.println("Luas : " + object2.getLuas());
    }



}
