public class MahasiswaDemo09 {
    public static void main(String[] args) {
        MahasiswaBerprestasi09 list = new MahasiswaBerprestasi09();
        Mahasiswa09 m1 = new Mahasiswa09("123", "Zidan", "2A", 3.2);
        Mahasiswa09 m2 = new Mahasiswa09("124", "Ayu", "2A", 3.5);
        Mahasiswa09 m3 = new Mahasiswa09("125", "Sofi", "2A", 3.1);
        Mahasiswa09 m4 = new Mahasiswa09("126", "Sita", "2A", 3.9);
        Mahasiswa09 m5 = new Mahasiswa09("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();
    }
}
