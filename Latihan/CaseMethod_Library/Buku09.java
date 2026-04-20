public class Buku09 {
    private String kodeBuku;
    private String judul;
    private int tahunTerbit;

    public Buku09(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void tampilkanInformasi() {
        System.out.println("Kode Buku : " + kodeBuku + " | Judul : " + judul + " | Tahun Terbit : " + tahunTerbit);
    }
}
