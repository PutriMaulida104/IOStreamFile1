package tugas;

// Nama : Putri Maulida
// NPM  : 2410010489

public class MainTugas {
    public static void main(String[] args) {
        
        // 1. Array String tetap untuk menampilkan kategori toko (Minimal 3 Kategori)
        String[] kategori = {"Elektronik", "Pakaian", "Makanan & Minuman"};
        System.out.println("=== Kategori Barang Toko ===");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println("- " + kategori[i]);
        }
        System.out.println();

        // 2. Membuat objek Gudang pertama untuk input data
        Gudang gudangUtama = new Gudang("barang.txt");

        // Menambahkan minimal 5 objek Barang
        gudangUtama.tambahBarang(new Barang("Laptop Asus", 8500000, 5));
        gudangUtama.tambahBarang(new Barang("Mouse Wireless", 150000, 15));
        gudangUtama.tambahBarang(new Barang("Keyboard Mekanik", 450000, 8));
        gudangUtama.tambahBarang(new Barang("Monitor LED", 1750000, 4));
        gudangUtama.tambahBarang(new Barang("Flashdisk 64GB", 95000, 25));

        // Menyimpan data barang ke berkas barang.txt
        System.out.println("=== Proses Menyimpan Data ===");
        gudangUtama.simpanKeBerkas();
        System.out.println();

        // 3. Membuat objek Gudang BARU untuk pembuktian manipulasi file berkas
        System.out.println("=== Membuktikan Data dengan Objek Gudang Baru ===");
        Gudang gudangBaru = new Gudang("barang.txt");
        
        // Memuat kembali data dari berkas
        gudangBaru.muatDariBerkas();
        
        // Menampilkan data yang dimuat dari berkas
        System.out.println("\n--- Isi Gudang Baru (Hasil Muat Berkas) ---");
        gudangBaru.tampilkanSemua();

        // Menampilkan hasil total nilai persediaan
        System.out.println("\nTotal Nilai Persediaan Gudang: Rp" + gudangBaru.totalNilai());
    }
}