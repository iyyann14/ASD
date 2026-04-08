public class DataPenjualanAksesoris {
    public void dataSemuaAksesoris(TokoAksesoris09[] arryAks) {
        for (TokoAksesoris09 p : arryAks) {
            p.tampil();
        }
    }

    public void cariAksesorisTermahal(TokoAksesoris09[] arryAks) {
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
        int totalTerjual = 0;

        for (TokoAksesoris09 p : arryAks) {
            totalTerjual += p.terjual;
        }
        System.out.println("Total Aksesoris Terjual     : " + totalTerjual);
    }
}