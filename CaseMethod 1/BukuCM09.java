public class BukuCM09 {
    String kodeBuku;
    String judul;
    String tahunTerbit;
    
    void Buku09(String kodeBuku, String judul, String tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilkanInformasi() {
        System.out.println("Kode Buku: " + kodeBuku);
        System.out.println("Judul: " + judul);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}
