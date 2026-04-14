public class PeminjamanCM09 {
    public MahasiswaCM09 mhs;
    public BukuCM09 buku;
    public int lamaPinjam, terlambat, denda;
    public int batasPinjam = 5;

    public PeminjamanCM09(MahasiswaCM09 mhs, BukuCM09 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    public void hitungDenda() {
        terlambat = lamaPinjam - batasPinjam;
        if (terlambat > 0) {
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    public void tampil() {
        System.out.printf("%-10s | %-12s | Lama: %-2d | Terlambat: %-2d | Denda: %-5d\n", 
            mhs.nama, buku.judul, lamaPinjam, terlambat, denda);
    }
}