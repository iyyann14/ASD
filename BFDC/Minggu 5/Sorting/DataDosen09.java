public class DataDosen09 {
    private Dosen09[] dataDosen = new Dosen09[10];
    private int idx = 0;

    public void tambah(Dosen09 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    public void sortingAsc() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].getUsia() > dataDosen[j + 1].getUsia()) {
                    Dosen09 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDsc() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].getUsia() > dataDosen[maxIdx].getUsia()) {
                    maxIdx = j;
                }
            }
            Dosen09 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen09 key = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].getUsia() < key.getUsia()) {
                dataDosen[j + 1] = dataDosen[j];
                j = j - 1;
            }
            dataDosen[j + 1] = key;
        }
    }
}
