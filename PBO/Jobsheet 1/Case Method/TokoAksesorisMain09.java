import java.util.Scanner;

public class TokoAksesorisMain09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int dummy;

        System.out.print("Masukkan Jumlah Aksesoris : ");
        int jumlah = sc.nextInt();

        TokoAksesoris09[] arrAks  = new TokoAksesoris09[jumlah];

        for (int i = 0; i < jumlah; i++) {

            String nama;
            String kategori;
            int harga;
            int terjual;
            int stok;

            System.out.println("Masukkan Data Aksesoris ke-" + (i + 1));

            System.out.print("Nama      : ");
            nama = sc1.nextLine();
            System.out.print("Kategori  : ");
            kategori = sc1.nextLine();
            System.out.print("Harga     : ");
            harga = sc1.nextInt();
            System.out.print("Terjual   : ");
            terjual = sc1.nextInt();
            System.out.print("Stok      : ");
            stok = sc.nextInt();

            arrAks[i] = new TokoAksesoris09(nama, kategori, harga, terjual, stok);
        }

        System.out.println("\n==== DATA SEMUA AKSESORIS ====");
        DataPenjualanAksesoris data = new DataPenjualanAksesoris();

        data.dataSemuaAksesoris(arrAks);
        data.hitungTotalPenjualan(arrAks);
        data.cariAksesorisTermahal(arrAks);
    }
}