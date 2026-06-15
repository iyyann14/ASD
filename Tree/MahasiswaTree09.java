package ASD.Tree;

public class MahasiswaTree09 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public MahasiswaTree09() {

    }

    public MahasiswaTree09(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
    }
}
