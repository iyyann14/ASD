package QueuePostTest;

import java.util.LinkedList;
import java.util.Queue;

public class Soal2 {
    public static void main(String[] args) {
        Queue<Integer> antrian = new LinkedList<>();

        antrian.add(100);
        antrian.add(200);
        antrian.add(300);

        System.out.println("Isi Antrian: ");
        for (int data : antrian) {
            System.out.println(data + " ");
        }
    }
}