public class AntrianLayanan09 {
    Mahasiswa09[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan09(int max) {
        this.max = max;
        this.data = new Mahasiswa09[max];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa09 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak dapat menambahkan " + mhs.nama);
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " Berhasil Masuk ke Antrian");
    }

    public Mahasiswa09 layaniAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong.");
            return null;
        }
        Mahasiswa09 mhs = data[front];
        size--;

        if (isEmpty()) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }

        return mhs;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong.");
        } else {
            System.out.println("Mahasiswa Terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");

            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
}
