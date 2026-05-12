public class MahasiswaAntri09 {

    String nim;
    String nama;
    String keperluan;

    public MahasiswaAntri09() {
    }

    public MahasiswaAntri09(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampil() {
        System.out.printf("NIM       : %s%n", nim);
        System.out.printf("Nama      : %s%n", nama);
        System.out.printf("Keperluan : %s%n", keperluan);
    }
}