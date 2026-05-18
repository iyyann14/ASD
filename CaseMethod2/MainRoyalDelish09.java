package CaseMethod2;

import java.util.Scanner;

public class MainRoyalDelish09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLPembeli09 antrian = new DLLPembeli09();
        DLLPesanan09 daftarPesanan = new DLLPesanan09();

        antrian.tambahAntrian(new Pembeli09("Ainra", "08224500000"));
        antrian.tambahAntrian(new Pembeli09("Danra", "08225411111"));
        antrian.tambahAntrian(new Pembeli09("Sanri", "08224522222"));

        int pilih;
        do {

            System.out.println("=================================");
            System.out.println("   SISTEM ANTRIAN ROYAL DELISH ");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu   : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();

                    Pembeli09 pembeli = new Pembeli09(nama, hp);
                    antrian.tambahAntrian(pembeli);
                    break;
                case 2:
                    antrian.tampilAntrian();
                    break;
                case 3:
                    NodePembeli09 keluar = antrian.hapusAntrian();
                    if (keluar != null) {
                        System.out.println("Pembeli : " + keluar.data.namaPembeli);

                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();

                        System.out.print("Harga     : ");
                        int harga = sc.nextInt();

                        Pesanan09 pesanan = new Pesanan09(kode, namaPesanan, harga);

                        daftarPesanan.tambahPesanan(pesanan);
                        System.out.println(keluar.data.namaPembeli + " telah memesan " + namaPesanan);
                    }
                    break;
                case 4:
                    daftarPesanan.tampilPesanan();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
        } while (pilih != 0);
    }
}