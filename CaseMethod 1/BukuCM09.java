public class BukuCM09 {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    
    // CONSTRUCTOR BUKU
    BukuCM09(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    //METHOD MENAMPILKAN DATA BUKU
    void tampilkanInformasi() {
        System.out.println("Kode Buku : " + kodeBuku + " | Judul : " + judul + " | Tahun Terbit : " + tahunTerbit);
    }
}
