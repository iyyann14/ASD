public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[];
    int idx;

    public DaftarMahasiswaBerprestasi(int size) {
        listMhs = new Mahasiswa[size];
    }

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampil();
            System.out.println("-----------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) {
                    Mahasiswa temp = listMhs[j];
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
            Mahasiswa temp = listMhs[idxMax];
            listMhs[idxMax] = listMhs[i];
            listMhs[i] = temp;
        }
    }
}
