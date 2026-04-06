public class MataKuliahMain09 {
    public static void main(String[] args) {
        MataKuliah09 mk1 = new MataKuliah09();
        mk1.kodeMK = "IF101";
        mk1.nama = "Pemrograman Java";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilkanInformasi();

        MataKuliah09 mkPemweb = new MataKuliah09("IF202", "Pemrograman Web", 2, 4);
        mkPemweb.tampilkanInformasi();
        mkPemweb.ubahSKS(3);
        mkPemweb.tambahJam(1);
        mkPemweb.kurangiJam(2);
        mkPemweb.tampilkanInformasi();
    }
}
