public class MainTiered {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa("123", "Test User", "TI");
        Buku b = new Buku("B1", "Test Book", 2023);

        // Case 1: Tidak telat (5 hari) -> Denda 0
        PeminjamanTiered p1 = new PeminjamanTiered(m, b, 5);
        p1.tampil();

        // Case 2: Telat 2 hari (Total 7 hari) -> 2 * 2000 = 4000
        PeminjamanTiered p2 = new PeminjamanTiered(m, b, 7);
        p2.tampil();

        // Case 3: Telat 5 hari (Total 10 hari) -> 5 * 2000 = 10000
        PeminjamanTiered p3 = new PeminjamanTiered(m, b, 10);
        p3.tampil();

        // Case 4: Telat 7 hari (Total 12 hari) -> (5 * 2000) + (2 * 5000) = 10000 + 10000 = 20000
        PeminjamanTiered p4 = new PeminjamanTiered(m, b, 12);
        p4.tampil();
    }
}
