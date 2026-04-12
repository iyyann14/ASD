import java.util.Scanner;

public class MainCM09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // DATA MAHASISWA
        MahasiswaCM09[] mhs = {
                new MahasiswaCM09("22001", "Andi", "Teknik Informatika"),
                new MahasiswaCM09("22002", "Budi", "Teknik Informatika"),
                new MahasiswaCM09("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // DATA BUKU
        BukuCM09[] buku = {
                new BukuCM09("B001", "Algoritma", 2020),
                new BukuCM09("B002", "Basis Data", 2019),
                new BukuCM09("B003", "Pemrograman", 2021),
                new BukuCM09("B004", "Fisika", 2024)
        };

        // DATA PEMINJAMAN
        PeminjamanCM09[] pinjam = {
                new PeminjamanCM09(mhs[0], buku[0], 7),
                new PeminjamanCM09(mhs[1], buku[1], 3),
                new PeminjamanCM09(mhs[2], buku[2], 10),
                new PeminjamanCM09(mhs[2], buku[3], 6),
                new PeminjamanCM09(mhs[0], buku[1], 4)
        };

        int pilih;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Buku");
            System.out.println("3. Tampilkan Data Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {

                case 1:
                    System.out.println("\nData Mahasiswa:");
                    for (MahasiswaCM09 m : mhs)
                        m.tampilkanInformasi();

                    System.out.println("\nData Buku:");
                    for (BukuCM09 b : buku)
                        b.tampilkanInformasi();
                    break;

                case 2:
                    System.out.println("\nData Buku:");
                    for (BukuCM09 b : buku)
                        b.tampilkanInformasi();
                    break;

                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (PeminjamanCM09 p : pinjam)
                        p.tampil();
                    break;

                case 4:
                    // INSERTION SORT
                    for (int i = 1; i < pinjam.length; i++) {
                        PeminjamanCM09 temp = pinjam[i];
                        int j = i - 1;

                        while (j >= 0 && pinjam[j].denda < temp.denda) {
                            pinjam[j + 1] = pinjam[j];
                            j--;
                        }
                        pinjam[j + 1] = temp;
                    }

                    System.out.println("\nSetelah Sorting Denda:");
                    for (PeminjamanCM09 p : pinjam)
                        p.tampil();
                    break;

                case 5:
                    // STEP 1: SORTING NIM (Insertion Sort)
                    for (int i = 1; i < pinjam.length; i++) {
                        PeminjamanCM09 temp = pinjam[i];
                        int j = i - 1;

                        while (j >= 0 &&
                                Integer.parseInt(pinjam[j].mhs.nim) > Integer.parseInt(temp.mhs.nim)) {
                            pinjam[j + 1] = pinjam[j];
                            j--;
                        }
                        pinjam[j + 1] = temp;
                    }

                    // STEP 2: INPUT NIM
                    System.out.print("Masukkan NIM yang dicari: ");
                    int cari = sc.nextInt();

                    // STEP 3: BINARY SEARCH
                    int left = 0;
                    int right = pinjam.length - 1;
                    boolean ditemukan = false;

                    while (left <= right) {
                        int mid = (left + right) / 2;

                        int nimMid = Integer.parseInt(pinjam[mid].mhs.nim);

                        if (nimMid == cari) {
                            System.out.println("\n=== DATA DITEMUKAN ===");
                            System.out.println("NIM   : " + pinjam[mid].mhs.nim);
                            System.out.println("Nama  : " + pinjam[mid].mhs.nama);
                            System.out.println("Buku  : " + pinjam[mid].buku.judul);
                            System.out.println("Hari  : " + pinjam[mid].lamaPinjam);
                            System.out.println("Denda : " + pinjam[mid].denda);
                            ditemukan = true;
                            break;
                        } else if (nimMid < cari) {
                            left = mid + 1;
                        } else {
                            right = mid - 1;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;

            }
        } while (pilih != 0);
    }
}