public class BukuCM09 {
    String kodeBuku;
    String judul;
    String tahunTerbit;
    
    public BukuCM09(String kodeBuku, String judul, String tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampil() {
        System.out.println("Kode Buku: " + kodeBuku);
        System.out.println("Judul: " + judul);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}
