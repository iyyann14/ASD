import java.util.Scanner;

public class QueueMain09 {
    public static void menu() {
        System.out.println("Masukkan Operasi yang Diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Kapasitas Queue: ");
        int n = sc.nextInt();

        Queue09 Q = new Queue09(n);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Data Baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;

                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang Dikeluarkan: " + dataKeluar);
                    }
                    break;

                case 3:
                    Q.print();
                    break;

                case 4:
                    Q.peek();
                    break;

                case 5:
                    Q.clear();
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid");
            }

        } while (pilih >= 1 && pilih <= 5);

        sc.close();
    }
}