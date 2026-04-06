import java.util.Scanner;

public class MainSum09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        Sum09 sm = new Sum09(elemen);
        for(int i = 0; i < elemen; i++){
            System.out.print("Masukkan keuntunga ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Brute Force: " + sm.totalBF());
        System.out.println("Total menggunakan DIvide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
