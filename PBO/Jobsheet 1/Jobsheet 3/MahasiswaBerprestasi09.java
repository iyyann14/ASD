public class MahasiswaBerprestasi09 {
    MahasiswaA09[] listMHhs;
    int idx;

    public MahasiswaBerprestasi09(int jumlah) {
        listMHhs = new MahasiswaA09[jumlah];
        idx = 0;
    }

    void tambah(MahasiswaA09 m) {
        if (idx < listMHhs.length) {
            listMHhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (MahasiswaA09 m : listMHhs) {
            if (m != null) {
                m.tampilkanInformasi();
                System.out.println("----------------------------------");
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMHhs[j].ipk < listMHhs[j + 1].ipk) {
                    MahasiswaA09 temp = listMHhs[j];
                    listMHhs[j] = listMHhs[j + 1];
                    listMHhs[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (listMHhs[j].ipk > listMHhs[idxMax].ipk) {
                    idxMax = j;
                }
            }
            MahasiswaA09 temp = listMHhs[idxMax];
            listMHhs[idxMax] = listMHhs[i];
            listMHhs[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            MahasiswaA09 temp = listMHhs[i];
            int j = i;
            while (j > 0 && listMHhs[j - 1].ipk < temp.ipk) {
                listMHhs[j] = listMHhs[j - 1];
                j--;
            }
            listMHhs[j] = temp;
        }
    }
}
