public class PeminjamanMain09 {
    public static void main(String[] args) {
        MahasiswaCM09 m1 = new MahasiswaCM09("2341720001", "Ani", "TI");
        BukuCM09 b1 = new BukuCM09("B001", "Belajar Java", "2023");

        PeminjamanCM09 p1 = new PeminjamanCM09(m1, b1, 7);
        p1.tampil();
    }
}
