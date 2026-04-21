import java.util.Scanner;

public class MainLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = {
                new Mahasiswa("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku[] buku = {
                new Buku("B001", "Algoritma", 2020),
                new Buku("B002", "Basis Data", 2019),
                new Buku("B003", "Pemrograman", 2021),
                new Buku("B004", "Fisika", 2024)
        };

        Peminjaman[] pinjam = {
                new Peminjaman(mhs[0], buku[0], 7),
                new Peminjaman(mhs[1], buku[1], 3),
                new Peminjaman(mhs[2], buku[2], 10),
                new Peminjaman(mhs[2], buku[3], 6),
                new Peminjaman(mhs[0], buku[1], 4)
        };

        int pilih;
        do {
            System.out.println("\n=== MENU (LINEAR SEARCH) ===");
            System.out.println("1. Tampilkan Data Peminjaman");
            System.out.println("2. Cari berdasarkan Nama (Linear Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (pilih) {
                case 1:
                    for (Peminjaman p : pinjam) p.tampil();
                    break;
                case 2:
                    System.out.print("Masukkan Nama yang dicari: ");
                    String cariNama = sc.nextLine();
                    boolean ditemukan = false;

                    System.out.println("\nHasil Pencarian:");
                    for (int i = 0; i < pinjam.length; i++) {
                        if (pinjam[i].mhs.nama.equalsIgnoreCase(cariNama)) {
                            System.out.println("=== DATA DITEMUKAN (Index ke-" + i + ") ===");
                            pinjam[i].tampil();
                            ditemukan = true;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Data dengan nama '" + cariNama + "' tidak ditemukan!");
                    }
                    break;
            }
        } while (pilih != 0);
    }
}
