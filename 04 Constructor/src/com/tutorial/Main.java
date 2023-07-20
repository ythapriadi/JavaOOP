package com.tutorial;

//Class tanpa Contructor (Class Polos)
class polos{
    String dataString ;
    int dataInteger;
}

//Class dengan Constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    //Contructor dipanggil pertama kali dibuat
    // Mahasiswa(){
    //     System.out.println("ini adalah Contructor");
    // }

    //Contructor dengan paramater
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }

}

public class Main {
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("ucup","19101152610494","Sistem Komputer");
        Mahasiswa mahasiswa2 = new Mahasiswa("otong","19101151610393","Sistem Informasi");
    
        
        // polos objectPolos = new polos();
        // objectPolos.dataString = "polos";
        // objectPolos.dataInteger = 0;

        // System.out.println(objectPolos.dataInteger);
        // System.out.println(objectPolos.dataInteger);
    }
    
}
