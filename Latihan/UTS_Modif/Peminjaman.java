class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int denda;

    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

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

    void tampil() {
        System.out.println(mhs.nim + " | " + mhs.nama + " | " + buku.judul +
                " | " + lamaPinjam + " hari | Denda: " + denda);
    }
}
