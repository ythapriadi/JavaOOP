package com.tutorial;

class Buku{
    String judul;
    String penulis;

    Buku (String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\nJudul  \t : " + this.judul);
        System.out.println("Penulis\t : " + this.penulis);
    }
}

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Killing me Inside","YTH Kuteki");
        buku1.display();

        //menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);

        //Assignment object
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        //karena buku1 dan buku 2 berada di referensi yang sama
        buku1.judul = "Kill the comander";
        buku1.display();
        buku2.display();

        //memasukkan object kedalam method
        fungsi(buku2);
        buku1.display();
        buku2.display();
    }

    public static void fungsi(Buku dataBuku){
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("Address dalam fungsi " + addressDataBuku);
        dataBuku.penulis = "YTH CONN";
    }
    
}
