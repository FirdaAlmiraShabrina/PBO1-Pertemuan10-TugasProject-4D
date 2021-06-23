package Buku;

public class Class1 {
    //atribut
    public int id_buku;
    public String judul_buku;
    public String isbn;
    public String penerbit;
    public String pengarang;
    public int tahun_terbit;
    public int jumlah_buku;
    public String deskripsi;

    //method
    public void tampilkanSemuaBuku(){
        System.out.println("-----------------------------------");
        System.out.println("Id Buku : " + id_buku);
        System.out.println("Judul Buku : " + judul_buku);
        System.out.println("ISBN : " + isbn);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Tahun Terbit : " + tahun_terbit);
        System.out.println("Jumlah Buku : " + jumlah_buku);
        System.out.println("Deskripsi : " + deskripsi);
    }

    public void tampilBuku(){
        System.out.println();
        System.out.println("Id Buku : " +id_buku);
        System.out.println("Judul Buku : " +judul_buku);
        System.out.println("ISBN : " +isbn);
        System.out.println("Jumlah Buku : " +jumlah_buku);
    }

    public void KetersedianBuku(int jumlah_buku, String judul_buku)
    {
        System.out.println("Jumlah Buku : " +jumlah_buku);
        System.out.println("Judul Buku : " +judul_buku);
    }

    public void judulBukuPengarang(String judul_buku, String pengarang)
    {
        System.out.println("Judul Buku : " +judul_buku);
        System.out.println("Pengarang : " +pengarang);
    }

    //constructor
    public Class1() {
    }

    public Class1(int id_buku, String judul_buku, String isbn, String penerbit, String pengarang, int tahun_terbit, int jumlah_buku, String deskripsi) {
        this.id_buku = id_buku;
        this.judul_buku = judul_buku;
        this.isbn = isbn;
        this.penerbit = penerbit;
        this.pengarang = pengarang;
        this.tahun_terbit = tahun_terbit;
        this.jumlah_buku = jumlah_buku;
        this.deskripsi = deskripsi;
    }

    public Class1(int id_buku, String judul_buku, String isbn, int jumlah_buku) {
        this.id_buku = id_buku;
        this.judul_buku = judul_buku;
        this.isbn = isbn;
        this.jumlah_buku = jumlah_buku;
    }

    //getter and setter
    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public int getJumlah_buku() {
        return jumlah_buku;
    }

    public void setJumlah_buku(int jumlah_buku) {
        this.jumlah_buku = jumlah_buku;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
