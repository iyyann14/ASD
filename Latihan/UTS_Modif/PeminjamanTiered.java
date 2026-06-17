class PeminjamanTiered {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int denda;

    PeminjamanTiered(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        int batas = 5;
        int dendaNormal = 2000;
        int dendaMahal = 5000;

        if (lamaPinjam > batas) {
            int telat = lamaPinjam - batas;
            if (telat <= 5) {
                // Terlambat 1-5 hari
                denda = telat * dendaNormal;
            } else {
                // Terlambat > 5 hari
                // 5 hari pertama denda normal, sisanya denda mahal
                denda = (5 * dendaNormal) + ((telat - 5) * dendaMahal);
            }
        } else {
            denda = 0;
        }
    }

    void tampil() {
        System.out.println(mhs.nim + " | " + mhs.nama + " | " + buku.judul +
                " | " + lamaPinjam + " hari | Denda: " + denda);
    }
}
