import java.util.Scanner;

public class KRSMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS09 antrian = new AntrianKRS09();

        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Mahasiswa Sudah Proses KRS");
            System.out.println("8. Cetak Jumlah Mahasiswa Belum Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswaaa09 mhs = new Mahasiswaaa09(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.prosesKRS();
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    System.out.println("Jumlah Mahasiswa Dalam Antrian: " + antrian.getJumlahAntrian());
                    break;

                case 7:
                    System.out.println("Jumlah Mahasiswa yang Sudah Proses KRS: " + antrian.getJumlahDiproses());
                    break;

                case 8:
                    System.out.println("Jumlah Mahasiswa yang Belum Proses KRS: " + antrian.getJumlahBelumProses());
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Terima Kasih.");
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid.");
            }
        } while (pilihan != 0);
    }
}