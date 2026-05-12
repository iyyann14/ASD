import java.util.Scanner;

public class MainAntrian09 {

    static Scanner sc = new Scanner(System.in);
    static AntrianLinkedList09 antrian = new AntrianLinkedList09();

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("   SISTEM ANTRIAN UNIT KEMAHASISWAAN");
        System.out.println("   Politeknik Negeri Malang");
        System.out.println("============================================");

        int pilihan;

        do {
            tampilMenu();

            System.out.print("Pilih menu : ");
            pilihan = Integer.parseInt(sc.nextLine().trim());
            System.out.println();

            switch (pilihan) {
                case 1:
                    menuDaftar();
                    break;
                case 2:
                    menuPanggil();
                    break;
                case 3:
                    antrian.tampilkan();
                    break;
                case 4:
                    menuCekKosong();
                    break;
                case 5:
                    menuCekPenuh();
                    break;
                case 6:
                    antrian.lihatTerdepan();
                    break;
                case 7:
                    antrian.lihatTerakhir();
                    break;
                case 8:
                    menuJumlah();
                    break;
                case 9:
                    menuKosongkan();
                    break;
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

            System.out.println();

        } while (pilihan != 0);

        sc.close();
    }

    // Tampil menu
    static void tampilMenu() {
        System.out.println("--------------------------------------------");
        System.out.println("   MENU ANTRIAN");
        System.out.println("--------------------------------------------");
        System.out.println("   1. Daftar Antrian");
        System.out.println("   2. Panggil / Layani Antrian");
        System.out.println("   3. Tampilkan Seluruh Antrian");
        System.out.println("   4. Cek Antrian Kosong");
        System.out.println("   5. Cek Antrian Penuh");
        System.out.println("   6. Lihat Antrian Terdepan");
        System.out.println("   7. Lihat Antrian Paling Akhir");
        System.out.println("   8. Jumlah Mahasiswa yang Antri");
        System.out.println("   9. Kosongkan Antrian");
        System.out.println("   0. Keluar");
        System.out.println("--------------------------------------------");
    }

    // (c) Daftar antrian - mahasiswa isi data sebelum masuk antrian
    static void menuDaftar() {
        System.out.println("=== PENDAFTARAN ANTRIAN ===");
        System.out.print("NIM       : ");
        String nim = sc.nextLine();

        System.out.print("Nama      : ");
        String nama = sc.nextLine();

        System.out.print("Keperluan : ");
        String keperluan = sc.nextLine();

        MahasiswaAntri09 mhs = new MahasiswaAntri09(nim, nama, keperluan);
        antrian.enqueue(mhs);
    }

    // (f) Panggil Antrian Berikutnya
    static void menuPanggil() {
        System.out.println("=== MEMANGGIL ANTRIAN ===");
        MahasiswaAntri09 dilayani = antrian.dequeue();
        if (dilayani != null) {
            System.out.println("Silakan Maju ke Loket:");
            System.out.println("------------------------------------------");
            dilayani.tampil();
        }
    }

    // (d) Cek Kosong
    static void menuCekKosong() {
        if (antrian.isEmpty()) {
            System.out.println("Status : Antrian Kosong.");
        } else {
            System.out.println("Status : Antrian Tidak Kosong. " + "(" + antrian.jumlahAntrian() + " Mahasiswa Sedang Antri)");
        }
    }

    // (d) Cek Penuh
    static void menuCekPenuh() {
        if (antrian.isFull()) {
            System.out.println("Status : Antrian Penuh. Kapasitas Maksimal Tercapai.");
        } else {
            System.out.println("Status : Antrian Belum Penuh. " + "Sisa Kapasitas Masih Tersedia.");
        }
    }

    // (h) Tampilkan Jumlah Antrian
    static void menuJumlah() {
        System.out.println("Jumlah Mahasiswa yang Masih Antri : " + antrian.jumlahAntrian() + " Orang.");
    }

    // (d) Kosongkan antrian
    static void menuKosongkan() {
        System.out.print("Yakin Ingin Mengosongkan Antrian? (y/n) : ");
        String konfirmasi = sc.nextLine();
        if (konfirmasi.equalsIgnoreCase("y")) {
            antrian.clear();
        } else {
            System.out.println("Pengosongan Antrian Dibatalkan.");
        }
    }
}