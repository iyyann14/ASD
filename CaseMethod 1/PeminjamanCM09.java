public class PeminjamanCM09 {
    MahasiswaCM09[] mhs = new MahasiswaCM09[5];
    BukuCM09[] buku = new BukuCM09[5];

    public PeminjamanCM09(MahasiswaCM09[] mhs, BukuCM09[] buku) {
        this.mhs = mhs;
        this.buku = buku;
    }
    
    int lamaPinjam;


    void Peminjaman09(int mhs, int buku, int lamaPinjam) {
        this.lamaPinjam = lamaPinjam;
        this.mhs = mhs;
        this.buku = buku;
    }
}