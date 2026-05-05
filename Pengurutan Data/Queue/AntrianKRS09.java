public class AntrianKRS09 {
    Mahasiswaaa09[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahDiproses;
    int maxDiproses;

    public AntrianKRS09() {
        max = 10;
        data = new Mahasiswaaa09[max];
        front = -1;
        rear = -1;
        size = 0;
        jumlahDiproses = 0;
        maxDiproses = 30;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian(Mahasiswaaa09 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, mahasiswa tidak dapat ditambahkan.");
            return;
        }

        if (jumlahDiproses >= maxDiproses) {
            System.out.println("DPA sudah menangani maksimal 30 mahasiswa.");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }

        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian KRS.");
    }

    public Mahasiswaaa09 panggilSatuMahasiswa() {
        Mahasiswaaa09 mhs = data[front];
        size--;

        if (isEmpty()) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }

        jumlahDiproses++;
        return mhs;
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang diproses.");
            return;
        }

        if (jumlahDiproses >= maxDiproses) {
            System.out.println("Batas maksimal 30 mahasiswa sudah tercapai.");
            return;
        }

        System.out.println("Mahasiswa yang dipanggil untuk proses KRS:");

        int jumlahPanggil = 2;
        if (size < 2) {
            jumlahPanggil = size;
        }

        for (int i = 0; i < jumlahPanggil; i++) {
            if (jumlahDiproses < maxDiproses) {
                Mahasiswaaa09 mhs = panggilSatuMahasiswa();
                System.out.print((i + 1) + ". ");
                mhs.tampilkanData();
            }
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Daftar Mahasiswa dalam Antrian KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");

        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Dua mahasiswa terdepan:");

        int jumlahTampil = 2;
        if (size < 2) {
            jumlahTampil = size;
        }

        for (int i = 0; i < jumlahTampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling akhir:");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahDiproses() {
        return jumlahDiproses;
    }

    public int getJumlahBelumProses() {
        return maxDiproses - jumlahDiproses;
    }
}