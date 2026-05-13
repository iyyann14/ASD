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
            System.out.println("4. Hapus Data Di Awal");
            System.out.println("5. Hapus Data Di Akhir");
            System.out.println("6. Tampilkan Data");
            System.out.println("7.  Tampilkan Data Terbalik");
            System.out.println("8.  Tambah Data Pada Indeks Tertentu");
            System.out.println("9.  Hapus Data Setelah NIM tertentu");
            System.out.println("10. Hapus Data Pada Indeks Tertentu");
            System.out.println("11. Tampilkan Data Pertama");
            System.out.println("12. Tampilkan Data Terakhir");
            System.out.println("13. Tampilkan Data Pada Indeks Tertentu");
            System.out.println("14. Tampilkan Jumlah Data");
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
                    System.out.print("Masukkan NIM yang Dicari : ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan Data Baru:");
                    list.insertAfter(keyNim, inputMahasiswa());
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 8:
                    System.out.print("Masukkan Indeks : ");
                    int idx = scan.nextInt();
                    scan.nextLine();
                    list.add(idx, inputMahasiswa());
                    break;
                case 9:
                    System.out.print("Masukkan NIM : ");
                    String nimAfter = scan.nextLine();
                    list.removeAfter(nimAfter);
                    break;
                case 10:
                    System.out.print("Masukkan Indeks yang Dihapus : ");
                    int removeIdx = scan.nextInt();
                    scan.nextLine();
                    list.remove(removeIdx);
                    break;
                case 11:
                    list.getFirst();
                    break;
                case 12:
                    list.getLast();
                    break;
                case 13:
                    System.out.print("Masukkan Indeks : ");
                    int getIdx = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(getIdx);
                    break;
                case 14:
                    System.out.println("Jumlah Data : " + list.getSize());
                    break;
                case 0:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Menu Tidak Valid.");
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