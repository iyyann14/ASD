import java.util.Scanner;

public class LayananAkademikSIAKAD09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan09 antrian = new AntrianLayanan09(5);

        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa Dalam Antrian"); 
            System.out.println("6. Cek Antrian Paling Belakang");
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

                    Mahasiswa09 mhs = new Mahasiswa09(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    Mahasiswa09 dilayani = antrian.layaniAntrian();
                    if (dilayani != null) {
                        System.out.println("Melayani Mahasiswa:");
                        dilayani.tampilkanData();
                    }
                    break;

                case 3:
                    antrian.lihatTerdepan();
                    break;

                case 4:
                    antrian.tampilkanSemua();
                    break;

                case 5:
                    System.out.println("Jumlah Mahasiswa Dalam Antrian: " + antrian.getJumlahAntrian());
                    break;

                case 6:
                    antrian.lihatAkhir();
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