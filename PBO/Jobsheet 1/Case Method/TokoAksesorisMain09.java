import java.util.Scanner;

public class TokoAksesorisMain09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Aksesoris : ");
        int jumlah = Integer.parseInt(sc.nextLine());

        TokoAksesoris09[] arrAks  = new TokoAksesoris09[jumlah];

        for (int i = 0; i < jumlah; i++) {

            String nama;
            String kategori;
            int harga;
            int terjual;
            int stok;

            System.out.println("Masukkan Data Aksesoris ke-" + (i + 1));

            System.out.print("Nama      : ");
            nama = sc.nextLine();
            System.out.print("Kategori  : ");
            kategori = sc.nextLine();
            System.out.print("Harga     : ");
            harga = Integer.parseInt(sc.nextLine());
            System.out.print("Terjual   : ");
            terjual = Integer.parseInt(sc.nextLine());
            System.out.print("Stok      : ");
            stok = Integer.parseInt(sc.nextLine());

            arrAks[i] = new TokoAksesoris09(nama, kategori, harga, terjual, stok);
        }

        System.out.println("\n==== DATA SEMUA AKSESORIS ====");
        DataPenjualanAksesoris data = new DataPenjualanAksesoris();

        data.dataSemuaAksesoris(arrAks);
        data.hitungTotalPenjualan(arrAks);
        data.cariAksesorisTermahal(arrAks);
    }
}
