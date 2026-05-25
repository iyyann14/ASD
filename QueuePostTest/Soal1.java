package QueuePostTest;

import java.util.LinkedList;
import java.util.Queue;

public class Soal1 {
    
    public static void main(String[] args) {
        Queue<Integer> antrian = new LinkedList<>();

        antrian.add(15);
        antrian.add(30);

        System.out.println("Isi Antrian: ");
        for (int data : antrian) {
            System.out.println(data + " ");
        }
    }
}