public class Peminjaman09 {
    private Mahasiswa09 mhs;
    private Buku09 buku;
    private int lamaPinjam;
    private int denda;

    public Peminjaman09(Mahasiswa09 mhs, Buku09 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    private void hitungDenda() {
        int batas = 5;
        int dendaPerHari = 2000;

        if (lamaPinjam > batas) {
            int telat = lamaPinjam - batas;
            denda = telat * dendaPerHari;
        } else {
            denda = 0;
        }
    }

    public Mahasiswa09 getMhs() {
        return mhs;
    }

    public Buku09 getBuku() {
        return buku;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public int getDenda() {
        return denda;
    }

    public void tampil() {
        System.out.println(mhs.getNim() + " | " + mhs.getNama() + " | " + buku.getJudul() +
                " | " + lamaPinjam + " hari | Denda: " + denda);
    }
}
