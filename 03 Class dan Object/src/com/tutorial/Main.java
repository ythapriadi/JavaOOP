package com.tutorial;

//Membuat class sebagai template
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;

}

public class Main {
    public static void main(String[] args) {

        //Instasiasi (Membuat object)
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "ucup";
        mahasiswa1.NIM = "19101152610393";
        mahasiswa1.jurusan = "Sistem Informasi";
        mahasiswa1.IPK = 3.39;
        mahasiswa1.umur = 22;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "otong";
        mahasiswa2.NIM = "19101152610394";
        mahasiswa2.jurusan = "Sistem Komputer";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 23;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
    }
}
