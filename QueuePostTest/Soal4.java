package QueuePostTest;

public class Soal4 {
    static int[] antrian = new int[10];
    static int front = -1, rear = -1;

    static void enqueue(int data) {
        if (front == -1) front = 0;
        antrian[++rear] = data;
    }

    static int dequeue() {
        int data =  antrian[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        return data;
    }

    public static void main(String[] args) {
        enqueue(101);
        enqueue(102);
        enqueue(103);

        System.out.println("Memanggil Pasien: " + dequeue());
        System.out.println("Memanggil Pasien: " + dequeue());
        System.out.println("Memanggil Pasien: " + dequeue());

        System.out.println("Nilai Front Akhir: " + front);
        System.out.println("Nilai Rear Akhir: " + rear);
    }
}