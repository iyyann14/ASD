package ASD.Tree;

public class BinaryTreeArray09 {
    MahasiswaTree09[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray09() {
        this.dataMahasiswa = new MahasiswaTree09[50];
    }

    void populateData(MahasiswaTree09 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void add(MahasiswaTree09 data) {
        int idx = 0;

        while (idx < dataMahasiswa.length) {
            if (dataMahasiswa[idx] == null) {
                dataMahasiswa[idx] = data;
                if (idx > idxLast) {
                    idxLast = idx;
                }
                return;
            } else {
                if (data.ipk < dataMahasiswa[idx].ipk) {
                    // Pergi ke kiri: indeks 2*idx+1
                    idx = 2 * idx + 1;
                } else {
                    // Pergi ke kanan: indeks 2*idx+2
                    idx = 2 * idx + 2;
                }
            }
        }
        System.out.println("Array penuh, tidak bisa menambah data!");
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}