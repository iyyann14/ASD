public class PeminjamanCM09 {
    MahasiswaCM09 mhs;
    BukuCM09 buku;
    int lamaPinjam;

    public PeminjamanCM09(MahasiswaCM09 mhs, BukuCM09 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    void tampil() {
        System.out.println("=== Detail Peminjaman ===");
        if (mhs != null) mhs.tampil();
        if (buku != null) buku.tampil();
        System.out.println("Lama Pinjam: " + lamaPinjam + " hari");
    }
}
