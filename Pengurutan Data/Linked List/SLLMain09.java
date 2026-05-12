import java.util.Scanner;

public class SLLMain09 {
    public static void main(String[] args) {

        SingleLinkedList09 sll = new SingleLinkedList09();

        MahasiswaList09 mhs1 = new MahasiswaList09("24212200", "Alvaro", "1A", 4.0);
        MahasiswaList09 mhs2 = new MahasiswaList09("22212202", "Cintia", "3C", 3.5);
        MahasiswaList09 mhs3 = new MahasiswaList09("23212201", "Bimon",  "2B", 3.8);
        MahasiswaList09 mhs4 = new MahasiswaList09("21212203", "Dirga",  "4D", 3.6);

        sll.print();                        

        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}