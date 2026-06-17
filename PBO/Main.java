import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = Integer.parseInt(sc.nextLine());
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama = ");
            String nama = sc.nextLine();
            System.out.print("Tahun Masuk = ");
            int thn = Integer.parseInt(sc.nextLine());
            System.out.print("Umur = ");
            int umur = Integer.parseInt(sc.nextLine());
            System.out.print("IPK = ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            list.tambah(m);
            System.out.println();
        }

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting bubble sort (IPK DESC) = ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting selection sort (IPK DESC) = ");
        list.selectionSort();
        list.tampil();
    }
}
