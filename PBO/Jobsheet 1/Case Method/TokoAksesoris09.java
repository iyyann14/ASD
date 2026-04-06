public class TokoAksesoris09 {
    String nama;
    String kategori;
    int harga;
    int terjual;
    int stok;
    int dummy;

    public TokoAksesoris09(){
    }

    public TokoAksesoris09(String nama, String kategori, int harga, int terjual, int stok) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.terjual = terjual;
        this.stok = stok;
    }

    void tampil() {
        System.out.println("Nama        : " + nama);
        System.out.println("Kategori    : " + kategori);
        System.out.println("Harga       : " + harga);
        System.out.println("Terjual     : " + terjual);
        System.out.println("Stok        : " + stok);
    }
}