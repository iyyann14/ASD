import java.util.Scanner;

public class SLLMain09 {
    public static void main(String[] args) {

        SingleLinkedList09 sll = new SingleLinkedList09();

        MahasiswaList09 mhs1 = new MahasiswaList09("24212200", "Alvaro", "1A", 4.0);
        MahasiswaList09 mhs2 = new MahasiswaList09("22212202", "Cintia", "3C", 3.5);
        MahasiswaList09 mhs3 = new MahasiswaList09("23212201", "Bimon", "2B", 3.8);
        MahasiswaList09 mhs4 = new MahasiswaList09("21212203", "Dirga", "4D", 3.6);

        sll.print();

        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        Scanner sc = new Scanner(System.in);
        System.out.println("=== Tambah Data Dari Keyboard ===");
        System.out.print("NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("IPK   : ");
        double ipk = Double.parseDouble(sc.nextLine());
        sll.addLast(new MahasiswaList09(nim, nama, kelas, ipk));
        sll.print();

        System.out.print("data index 1 : ");
        sll.getData(1);

        System.out.println("Data Mahasiswa an Bimon Berada Pada Index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();


        sc.close();
    }
}