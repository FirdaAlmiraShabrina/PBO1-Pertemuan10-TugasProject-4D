package BukuBeraksi;

import Buku.Class1;
import PeminjamanBuku.Class2;

public class Class3 {
    public static void main(String[] args) {

        //Pembuatan object untuk Class1
        Class1 modul = new Class1();
        modul.id_buku = 1;
        modul.judul_buku = "Pemrograman Berorientasi Objek";
        modul.isbn = "9766237131236";
        modul.penerbit = "INFORMATIKA";
        modul.pengarang = "Ade Rahmat Iskandar";
        modul.tahun_terbit = 2020;
        modul.jumlah_buku = 50;
        modul.deskripsi = "Menguasai Pemrograman Berorientasi Objek";

        modul.tampilkanSemuaBuku();
        System.out.println("-----------------------------------");

        Class1 dongeng = new Class1();
        dongeng.id_buku = 2;
        dongeng.judul_buku = "Cinderella";
        dongeng.isbn = "9780736430029";
        dongeng.jumlah_buku = 35;
        dongeng.tampilBuku();
        System.out.println("----------------------------------------------------------");


        Class1 buku = new Class1();
        System.out.println("Tampil Ketersedian Buku");
        buku.KetersedianBuku(50, "Pemrograman Berorientasi Objek");
        System.out.println("----------------------------------------------------------");

        Class1 buku2 = new Class1();
        System.out.println("Tampil Judul Buku & Pengarang");
        buku2.judulBukuPengarang("Laskar Pelangi", "Andrea Hirata");
        System.out.println("----------------------------------------------------------");

        //pembuatan object untuk Class2
        Class2 pinjam1 = new Class2();
        pinjam1.id_buku = 3;
        pinjam1.NamaPeminjam = "Firda Almira Shabrina";
        pinjam1.JudulBukuDipinjam = "Mariposa";
        pinjam1.JumlahBukuDipinjam = 1;
        pinjam1.TampilkanInfoDataPeminjaman();


        Class2 pinjam2 = new Class2();
        pinjam2.id_buku = 4;
        pinjam2.NamaPeminjam = "Nurul Hidayah";
        pinjam2.JudulBukuDipinjam = "With You";
        pinjam2.JumlahBukuDipinjam = 1;
        pinjam2.TampilkanInfoDataPeminjaman();

        System.out.println("Tampil Daftar Nama Peminjam");
        pinjam1.DaftarNamaPeminjam("Firda Almira Shabrina");
        pinjam2.DaftarNamaPeminjam("Nurul Hidayah");

        //object constructor Class1
        Class1 object1 = new Class1(5, "Rindu", "978118987490", "ELEXMEDIA", "Virginia Woolf", 2009,10, "Menceritakan tentang kerinduan" );
        object1.tampilkanSemuaBuku();
        Class1 object2 = new Class1(6, "Sebuah Usaha Melupakan", "8175294057660", 20);
        object2.tampilBuku();

        Class1 object3 = new Class1(7, "Sang Pemimpi", "8175257660", 30);
        object3.tampilBuku();
        Class1 object4 = new Class1(8, "Senja Dimata Bintang", "9786028519939", 40);
        object4.tampilBuku();

        Class1 object5 = new Class1(9, "Cinta Yang Sederhana", "978568987606", "ERLANGGA", "Taufiq Ismail", 2015, 50, "tentang seorang pria berjuta pembelajaran dalam hidupnya");
        object5.tampilkanSemuaBuku();
        Class1 object6 = new Class1(10, "Buku Minta di Sayang", "9786028519939", "BINTANG PUSTAKA", "Eka Kurniawan", 2021, 60, "tentang jatuh cinta, ego, putus");
        object6.tampilkanSemuaBuku();
    }

}
