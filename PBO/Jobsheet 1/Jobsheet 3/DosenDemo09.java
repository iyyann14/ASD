import java.util.Scanner;

public class DosenDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen : ");
        int jumlah = sc.nextInt();

        DosenN09[] arrayOfDosen = new DosenN09[jumlah];

        for (int i = 0; i < jumlah; i++) {

            String kode;
            String nama;
            boolean jenisKelamin;
            int usia;

            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode                          : ");
            kode = sc1.nextLine();
            System.out.print("Nama                          : ");
            nama = sc1.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita)   : ");
            String jk = sc1.nextLine();
            jenisKelamin = jk.equalsIgnoreCase("Pria");
            System.out.print("Usia                          : ");
            usia = sc.nextInt();

            arrayOfDosen[i] = new DosenN09(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n==== DATA SEMUA DOSEN ====");
        DataDosen09 data = new DataDosen09();

        data.dataSemuaDosen(arrayOfDosen);
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        data.infoDosenPalingTua(arrayOfDosen);
        data.infoDosenPalingMuda(arrayOfDosen);
    }
}