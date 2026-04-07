import java.util.Scanner;

public class MahasiswaDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = Integer.parseInt(sc.nextLine());
        Mahasiswa09[] arrayOfMahasiswa = new Mahasiswa09[jumlah];
        String dummy;

        for(int i = 0; i < jumlah; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa09();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------");
        }

        
        for(int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].tampilkanInformasi();
        }
    }
}
