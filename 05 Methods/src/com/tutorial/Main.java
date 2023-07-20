package com.tutorial;

class Mahasiswa {
    //Data Member
    String nama;
    String NIM;

    //Contructor
    Mahasiswa(String nama, String NIM){
       this.nama = nama;
       this.NIM = NIM;

    }

    //Method tanpa return dan tanpa paramater
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);

    }

    //Methode tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;

    }

    //Methode dengan return tapi tidak ada parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    //Methode dengan return dan dengan parameter
    String sayHi(String message){
        return message + " juga, nama saya" + this.nama; 
    }
}

class Dosen{
    String nama;

    Dosen(String nama){
        this.nama = nama;
    }
}
public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Ucup","19101152610393");
        //Method
        mahasiswa1.show();
        mahasiswa1.setNama("Tutung");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("Ganteng");
        System.out.println(data);

        Dosen dosen1 = new Dosen("otong");

    }

    static void test(){
        System.out.println("Ini adalah methode test");
    }
}
