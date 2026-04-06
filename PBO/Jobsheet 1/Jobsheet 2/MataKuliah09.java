public class MataKuliah09 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah09() {

    }

    public MataKuliah09(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("--------------------------");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS Berhasil Diubah Menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jam Berhasil Ditambah. Total Jam: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jam Berhasil Dikurangi. Total Jam: " + jumlahJam);
        } else {
            System.out.println("Pengurangan Gagal! Jam Tidak Mencukupi.");
        }
    }
}