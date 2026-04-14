public class Mahasiswa09 {
    private String nim;
    private String nama;
    private String prodi;

    public Mahasiswa09(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void tampilkanInformasi() {
        System.out.println("NIM : " + nim + " | Nama : " + nama + " | Prodi : " + prodi);
    }
}
