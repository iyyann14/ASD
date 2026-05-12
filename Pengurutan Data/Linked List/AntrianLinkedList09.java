public class AntrianLinkedList09 {

    private static final int KAPASITAS_MAKS = 20;

    private NodeAntri09 front;
    private NodeAntri09 rear;
    private int       size;

    public AntrianLinkedList09() {
        front = null;
        rear  = null;
        size  = 0;
    }

    // (d) Cek Kosong
    public boolean isEmpty() {
        return front == null;
    }

    // (d) Cek Penuh
    public boolean isFull() {
        return size >= KAPASITAS_MAKS;
    }

    // (d) Kosongkan antrian
    public void clear() {
        front = null;
        rear  = null;
        size  = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    // (e) Tambah Antrian Enqueue
    public void enqueue(MahasiswaAntri09 mhs) {
        if (isFull()) {
            System.out.println("Antrian PENUH! Mahasiswa tidak bisa mendaftar.");
            return;
        }
        NodeAntri09 baru = new NodeAntri09(mhs);
        if (isEmpty()) {
            front = baru;
            rear  = baru;
        } else {
            rear.next = baru;
            rear      = baru;
        }
        size++;
        System.out.printf("[+] %s berhasil masuk antrian. Nomor: %d%n", mhs.nama, size);
    }

    // (f) Panggil Antrian Dequeue
    public MahasiswaAntri09 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian KOSONG! Tidak ada yang dapat dipanggil.");
            return null;
        }
        MahasiswaAntri09 dilayani = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        System.out.printf("[v] Memanggil: %s (NIM: %s)%n", dilayani.nama, dilayani.nim);
        return dilayani;
    }

    // (g) Lihat Terdepan
    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan:");
            front.data.tampil();
        }
    }

    // (g) Lihat Paling Akhir
    public void lihatTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir:");
            rear.data.tampil();
        }
    }

    // (h) Jumlah Antrian
    public int jumlahAntrian() {
        return size;
    }

    // Tampilkan Semua Antrian
    public void tampilkan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("===================================");
        System.out.println("DAFTAR ANTRIAN UNIT KEMAHASISWAAN");
        System.out.println("===================================");
        NodeAntri09 tmp = front;
        int no = 1;
        while (tmp != null) {
            System.out.printf("%2d. %-10s | %-15s | %s%n", no, tmp.data.nim, tmp.data.nama, tmp.data.keperluan);
            tmp = tmp.next;
            no++;
        }
        System.out.println("===================================");
        System.out.printf("Total: %d mahasiswa%n", size);
    }
}