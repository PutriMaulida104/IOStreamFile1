package tugas;

public class Barang {
    private String nama;
    private double harga;
    private int stok;

    // Constructor untuk menginisialisasi objek Barang
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk harga
    public double getHarga() {
        return harga;
    }

    // Getter untuk stok
    public int getStok() {
        return stok;
    }

    // Mengubah objek menjadi baris teks untuk disimpan ke berkas (pemisah menggunakan ';')
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    // Mengembalikan informasi barang dalam bentuk teks terformat
    public String info() {
        return nama + " | Harga: Rp" + harga + " | Stok: " + stok;
    }
}