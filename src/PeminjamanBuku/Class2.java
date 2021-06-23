package PeminjamanBuku;

import Buku.Class1;

public class Class2 extends Class1 {
    //atribut
    public String NamaPeminjam;
    public String JudulBukuDipinjam;
    public int JumlahBukuDipinjam;

    //method
    public void TampilkanInfoDataPeminjaman(){
        System.out.println("*****************************************");
        System.out.println("Nama Peminjam : " +NamaPeminjam);
        System.out.println("Judul Buku : " +JudulBukuDipinjam);
        System.out.println("Jumlah Buku Dipinjam : " +JumlahBukuDipinjam);
        System.out.println("----------------------------------------------------------");
    }

    public void DaftarNamaPeminjam(String NamaPeminjam){
        System.out.println("Nama Peminjam : " +NamaPeminjam);
    }

    //getter and setter
    public String getNamaPeminjam() {
        return NamaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        NamaPeminjam = namaPeminjam;
    }

    public String getJudulBukuDipinjam() {
        return JudulBukuDipinjam;
    }

    public void setJudulBukuDipinjam(String judulBukuDipinjam) {
        JudulBukuDipinjam = judulBukuDipinjam;
    }

    public int getJumlahBukuDipinjam() {
        return JumlahBukuDipinjam;
    }

    public void setJumlahBukuDipinjam(int jumlahBukuDipinjam) {
        JumlahBukuDipinjam = jumlahBukuDipinjam;
    }

    //overriding
    @Override
    public void tampilkanSemuaBuku() {
        super.tampilkanSemuaBuku();
    }

    @Override
    public void KetersedianBuku(int jumlah_buku, String judul_buku) {
        super.KetersedianBuku(jumlah_buku, judul_buku);
    }
}

