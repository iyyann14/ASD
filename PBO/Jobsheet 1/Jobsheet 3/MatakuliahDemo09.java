import java.util.Scanner;

public class MatakuliahDemo09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah MataKuliah : ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Matakuliah09[] arrayOfMatakuliah = new Matakuliah09[jumlah];

        for(int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data MataKuliah ke-" + (i + 1));

            arrayOfMatakuliah[i] = new Matakuliah09();
            arrayOfMatakuliah[i].tambahData(sc);
        }

        System.out.println("\n==== Data Mata Kuliah ====");

        for(int i = 0; i < jumlah; i++) {
            System.out.println("Data MataKuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}