import java.util.Scanner;

public class DLLMain09 {

    static Scanner scan = new Scanner(System.in);
    static DoubleLinkedList09 list = new DoubleLinkedList09();

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Sisipkan Data di Tengah (Setelah NIM)");
            System.out.println("4. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    list.addFirst(inputMahasiswa());
                    break;
                case 2:
                    list.addLast(inputMahasiswa());
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru:");
                    list.insertAfter(keyNim, inputMahasiswa());
                    break;
                case 4:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }

        } while (pilihan != 0);

        scan.close();
    }

    static MahasiswaDLL09 inputMahasiswa() {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = Double.parseDouble(scan.nextLine());
        return new MahasiswaDLL09(nim, nama, kelas, ipk);
    }
}