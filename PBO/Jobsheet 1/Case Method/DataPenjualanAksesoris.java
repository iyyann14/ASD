public class DataPenjualanAksesoris {
    public void dataSemuaAksesoris(TokoAksesoris09[] arryAks) {
        if (arryAks == null || arryAks.length == 0) {
            System.out.println("Data aksesoris kosong.");
            return;
        }
        for (TokoAksesoris09 p : arryAks) {
            p.tampil();
            System.out.println("--------------------");
        }
    }

    public void cariAksesorisTermahal(TokoAksesoris09[] arryAks) {
        if (arryAks == null || arryAks.length == 0) {
            System.out.println("\nTidak ada data untuk mencari aksesoris termahal.");
            return;
        }
        TokoAksesoris09 termahal = arryAks[0];

        for (TokoAksesoris09 p : arryAks) {
            if (p.harga > termahal.harga) {
                termahal = p;
            }
        }
        System.out.println("\n==== AKSESORIS TERMAHAL ====");
        termahal.tampil();
    }

    public void hitungTotalPenjualan(TokoAksesoris09[] arryAks) {
        if (arryAks == null || arryAks.length == 0) {
            System.out.println("\nTotal Seluruh Aksesoris Terjual: 0");
            return;
        }
        int totalTerjual = 0;

        for (TokoAksesoris09 p: arryAks) {
            totalTerjual += p.terjual;
        }
        System.out.println("\nTotal Seluruh Aksesoris Terjual: " + totalTerjual);
    }
}
