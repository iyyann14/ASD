public class Dosen09 {
    private String kode;
    private String nama;
    private boolean jenisKelamin;
    private int usia;

    public Dosen09(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public int getUsia() {
        return usia;
    }

    public void tampil() {
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia            : " + usia);
        System.out.println("--------------------------");
    }
}
