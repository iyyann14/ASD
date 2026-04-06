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
            } else {}
        }
    }
    public void hitungTotalPenjualan(TokoAksesoris09[] arryAks) {
        int jumlahPenjualan = 0;

        for (TokoAksesoris09 p: arryAks) {
            if (p.terjual) {
                jumlahPenjualan++;
                System.out.println("Jumlah Aksesoris Terjual    : " + jumlahPenjualan);
            } else {}
        }
    }
}