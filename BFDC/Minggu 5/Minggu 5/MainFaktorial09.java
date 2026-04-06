import java.util.Scanner;

public class MainFaktorial09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();

        Faktorial09 fk = new Faktorial09();
        System.out.println("Nilai Faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + "menggunakan DC: " + fk.faktorialDC(nilai));
    }
}