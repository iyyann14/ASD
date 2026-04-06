public class MahasiswaBerprestasi09 {
    Mahasiswa09[] listMHhs = new Mahasiswa09[5];
    int idx;

    void tambah(Mahasiswa09 m) {
        if (idx < listMHhs.length) {
            listMHhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMHhs[i].tampilkanInformasi();
            System.out.println("------------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMHhs[j].ipk < listMHhs[j + 1].ipk) {
                    Mahasiswa09 temp = listMHhs[j];
                    listMHhs[j] = listMHhs[j + 1];
                    listMHhs[j + 1] = temp;
                }
            }
        }
    }
}
