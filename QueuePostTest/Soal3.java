package QueuePostTest;

import java.util.Scanner;

public class Soal3 {
    static int[] antrian;
    static int front = -1, rear = -1, maks;

    static boolean isFull() {
        return rear == maks - 1;
    }

    static void enqueue(int data) {
        if (!isFull()) {
            if (front == -1) front = 0;
            antrian[++rear] = data;
        }
    }

    static int peek() {
        return antrian[front];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Kapasitas: ");
        maks = sc.nextInt();
        antrian = new int[maks];

        System.out.println("Apakah Antrian Penuh? " + isFull());

        enqueue(101);

        System.out.println("Elemen Terdepan (peek): " + peek());
    }
}