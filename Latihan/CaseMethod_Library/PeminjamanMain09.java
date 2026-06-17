import java.util.Scanner;

public class PeminjamanMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // DATA MAHASISWA
        Mahasiswa09[] mhs = {
                new Mahasiswa09("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa09("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa09("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // DATA BUKU
        Buku09[] buku = {
                new Buku09("B001", "Algoritma", 2020),
                new Buku09("B002", "Basis Data", 2019),
                new Buku09("B003", "Pemrograman", 2021),
                new Buku09("B004", "Fisika", 2024)
        };

        // DATA PEMINJAMAN
        Peminjaman09[] pinjam = {
                new Peminjaman09(mhs[0], buku[0], 7),
                new Peminjaman09(mhs[1], buku[1], 3),
                new Peminjaman09(mhs[2], buku[2], 10),
                new Peminjaman09(mhs[2], buku[3], 6),
                new Peminjaman09(mhs[0], buku[1], 4)
        };

        PeminjamanManager09 manager = new PeminjamanManager09(pinjam);

        int pilih;
        do {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Buku");
            System.out.println("3. Tampilkan Data Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda (Terbesar)");
            System.out.println("5. Cari berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            try {
                pilih = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                pilih = -1;
            }

            switch (pilih) {
                case 1:
                    System.out.println("\nData Mahasiswa:");
                    for (Mahasiswa09 m : mhs)
                        m.tampilkanInformasi();
                    break;

                case 2:
                    System.out.println("\nData Buku:");
                    for (Buku09 b : buku)
                        b.tampilkanInformasi();
                    break;

                case 3:
                    System.out.println("\nData Peminjaman:");
                    manager.tampilkanSemua();
                    break;

                case 4:
                    manager.urutkanDendaDesc();
                    System.out.println("\nSetelah Sorting Denda (Descending):");
                    manager.tampilkanSemua();
                    break;

                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    try {
                        int cari = Integer.parseInt(sc.nextLine());
                        manager.cariNIM(cari);
                    } catch (Exception e) {
                        System.out.println("Input NIM harus berupa angka!");
                    }
                    break;
                case 0:
                    System.out.println("Terima Kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilih != 0);
    }
}
