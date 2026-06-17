import java.util.Scanner;

public class MainSelectionSort {
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
            System.out.println("\n=== MENU (SELECTION SORT) ===");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Buku");
            System.out.println("3. Tampilkan Data Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda (Selection Sort Desc)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    for (Mahasiswa m : mhs) m.tampilkanInformasi();
                    break;
                case 2:
                    for (Buku b : buku) b.tampilkanInformasi();
                    break;
                case 3:
                    for (Peminjaman p : pinjam) p.tampil();
                    break;
                case 4:
                    // SELECTION SORT (Descending)
                    for (int i = 0; i < pinjam.length - 1; i++) {
                        int idxMax = i;
                        for (int j = i + 1; j < pinjam.length; j++) {
                            if (pinjam[j].denda > pinjam[idxMax].denda) {
                                idxMax = j;
                            }
                        }
                        Peminjaman temp = pinjam[idxMax];
                        pinjam[idxMax] = pinjam[i];
                        pinjam[i] = temp;
                    }
                    System.out.println("\nSetelah Sorting Denda (Descending):");
                    for (Peminjaman p : pinjam) p.tampil();
                    break;
            }
        } while (pilih != 0);
    }
}
