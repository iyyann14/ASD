import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen dataDosenObj = new DataDosen();
        int menu;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah data");
            System.out.println("2. Tampil data");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection/Insertion Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (menu) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (Pria/Wanita): ");
                    String jkStr = sc.nextLine();
                    boolean jk = jkStr.equalsIgnoreCase("Pria");
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen dsn = new Dosen(kode, nama, jk, usia);
                    dataDosenObj.tambah(dsn);
                    break;
                case 2:
                    System.out.println("\nData Seluruh Dosen:");
                    dataDosenObj.tampil();
                    break;
                case 3:
                    System.out.println("\nSorting ASC (Usia termuda ke tertua):");
                    dataDosenObj.sortingAsc();
                    dataDosenObj.tampil();
                    break;
                case 4:
                    System.out.println("\nSorting DSC (Usia tertua ke termuda):");
                    System.out.println("1. Selection Sort");
                    System.out.println("2. Insertion Sort");
                    System.out.print("Pilih algoritma: ");
                    int algo = sc.nextInt();
                    if (algo == 1) {
                        dataDosenObj.sortingDsc();
                    } else {
                        dataDosenObj.insertionSort();
                    }
                    dataDosenObj.tampil();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menu != 5);
        sc.close();
    }
}
