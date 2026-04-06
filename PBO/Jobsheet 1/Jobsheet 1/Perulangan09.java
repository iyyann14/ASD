import java.util.Scanner;

public class Perulangan09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length()-2));
        if (n < 10) n+=10;
        
        System.out.print("Output : ");

        boolean pertama = true;

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) continue;

            String hasil;

            if (i % 3 == 0) hasil = "#";
            else if (i % 2 == 0) hasil = String.valueOf(i);
            else hasil = "*";

            if (!pertama) System.out.print(" ");
            System.out.print(hasil);
            pertama = false;
        }
    }
}