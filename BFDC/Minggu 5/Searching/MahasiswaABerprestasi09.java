public class MahasiswaABerprestasi09 {
    MahasiswaA09[] listMhs = new MahasiswaA09[5];

    public MahasiswaABerprestasi09(MahasiswaA09[] jumMhs) {
        this.listMhs = new MahasiswaA09[jumMhs.length];
    }

    int idx;

    void tambah(MahasiswaA09 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilkanInformasi();
            System.out.println("-----------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) {
                    MahasiswaA09 temp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (listMhs[j].ipk > listMhs[idxMax].ipk) {
                    idxMax = j;
                }
            }
            MahasiswaA09 temp = listMhs[idxMax];
            listMhs[idxMax] = listMhs[i];
            listMhs[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            MahasiswaA09 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    int sequentialSearch(double cari) {
        int posisi = -1;
        for (int j = 0; j < idx; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch(double cari, int left, int right) {
        if (right >= left) {
            int mid = (right + left) / 2;
            if (listMhs[mid].ipk == cari) {
                return mid;
            } else if (listMhs[mid].ipk < cari) {
                return findBinarySearch(cari, left, mid - 1);
            }
            return findBinarySearch(cari, mid + 1, right);
        }
        return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data Mahasiswa dengan IPK " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data Mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t : " + x);
        } else {
            System.out.println("Data Mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}