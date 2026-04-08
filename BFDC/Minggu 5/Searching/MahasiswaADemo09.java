import java.util.Scanner;

public class MahasiswaADemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = Integer.parseInt(sc.nextLine());
        MahasiswaABerprestasi09 list = new MahasiswaABerprestasi09(new MahasiswaA09[jumMhs]);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            double ipk = Double.parseDouble(sc.nextLine());
            System.out.println("----------------------------------");
            list.tambah(new MahasiswaA09(nim, nama, kelas, ipk));
        }

        list.selectionSort();
        list.tampil();

        System.out.println("\n=== Pencarian dengan Sequential Search ===");
        System.out.println("-------------------------------");
        System.out.println("Pencarian Data Mahasiswa Berprestasi");
        System.out.println("----------------------------------");
        System.out.println("Masukkan IPK yang dicari : ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();

        double posisi = list.sequentialSearch(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("\n=== Pencarian dengan Binary Search ===");
        System.out.println("-------------------------------");
        System.out.println("Pencarian Data Mahasiswa Berprestasi");
        System.out.println("----------------------------------");
        System.out.println("Masukkan IPK yang dicari : ");
        System.out.print("IPK : ");

        double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}