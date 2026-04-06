public class MainTugas09 {
    public static void main(String[] args) {
        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
        long[] nim = {220101001, 220101002, 220101003, 220101004, 220101005, 220101006, 220101007, 220101008};
        int[] thnMasuk = {2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020};
        int[] uts = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] uas = {82, 88, 87, 79, 95, 85, 83, 84};

        Tugas09 tugas = new Tugas09();

        System.out.println("\n=== Data Mahasiswa ===");
        System.out.printf("%-10s | %-12s | %-12s | %-10s | %-10s\n", "Nama", "NIM", "Tahun Masuk", "Nilai UTS", "Nilai UAS");
        for(int i = 0; i < nama.length; i++) {
            System.out.printf("%-10s | %-12d | %-12d | %-10d | %-10d\n", nama[i], nim[i], thnMasuk[i], uts[i], uas[i]);
        }

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Nilai UAS Tertinggi: " + tugas.maxUTS(uts, 0, uts.length - 1));
        System.out.println("Nilai UAS Terendah : " + tugas.minUTS(uts, 0, uts.length - 1));
        System.out.println("Rata-Rata Nilai UAS: " + tugas.rataUAS(uas));
    }
}