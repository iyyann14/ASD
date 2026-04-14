import java.util.Scanner;

public class MainCM09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProsesCM09 proses = new ProsesCM09();

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
                    for (MahasiswaCM09 m : proses.mhs)
                        m.tampilkanInformasi();
                    break;

                case 2:
                    System.out.println("\nData Buku:");
                    for (BukuCM09 b : proses.buku)
                        b.tampilkanInformasi();
                    break;

                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (PeminjamanCM09 p : proses.pinjam)
                        p.tampil();
                    break;

                case 4:
                    ProsesCM09.insertionSortByDenda(proses.pinjam);
                    System.out.println("\nSetelah Sorting Denda:");
                    for (PeminjamanCM09 p : proses.pinjam)
                        p.tampil();
                    break;

                case 5:
                    ProsesCM09.insertionSortByNIM(proses.pinjam);
                    // STEP 2: INPUT NIM
                    System.out.print("Masukkan NIM yang dicari: ");
                    int cari = sc.nextInt();
                    ProsesCM09.cariNIM(proses.pinjam, String.valueOf(cari));
                    break;

            }
        } while (pilih != 0);
    }
}