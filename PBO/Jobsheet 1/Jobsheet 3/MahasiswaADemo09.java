import java.util.Scanner;

public class MahasiswaADemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = Integer.parseInt(sc.nextLine());
        MahasiswaBerprestasi09 list = new MahasiswaBerprestasi09(jumlah);
        String dummy;

        for(int i = 0; i < jumlah; i++) {
            MahasiswaA09 m = new MahasiswaA09();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            m.nim = sc.nextLine();
            System.out.print("Nama : ");
            m.nama = sc.nextLine();
            System.out.print("Kelas : ");
            m.kelas = sc.nextLine();
            System.out.print("IPK : ");
            dummy = sc.nextLine();
            m.ipk = Float.parseFloat(dummy);
            list.tambah(m);
            System.out.println("----------------------------------");
        }

        
        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah bubbleSort (IPK Desc): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Mahasiswa setelah selectionSort (IPK Desc): ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data Mahasiswa setelah insertionSort (IPK Desc): ");
        list.insertionSort();
        list.tampil();
    }
}
