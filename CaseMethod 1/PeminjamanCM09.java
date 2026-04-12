class PeminjamanCM09 {
    MahasiswaCM09 mhs;
    BukuCM09 buku;
    int lamaPinjam;
    int denda;

    // CONSTRUCTOR PEMINJAMAN
    PeminjamanCM09(MahasiswaCM09 mhs, BukuCM09 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    //METHOD MENGHITUNG DENDA
    void hitungDenda() {
        int batas = 5;
        int dendaPerHari = 2000;

        if (lamaPinjam > batas) {
            int telat = lamaPinjam - batas;
            denda = telat * dendaPerHari;
        } else {
            denda = 0;
        }
    }

    //METHOD MENAMPILKAN DATA PEMINJAMAN 
    void tampil() {
        System.out.println(mhs.nim + " | " + mhs.nama + " | " + buku.judul +
                " | " + lamaPinjam + " hari | Denda: " + denda);
    }
}