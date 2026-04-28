public class TugasStackSurat09 {
    TugasSurat09[] dataSurat;
    int top;
    int size;

    TugasStackSurat09() {
        
    }

    public TugasStackSurat09(int size) {
        this.size = size;
        dataSurat = new TugasSurat09[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void terimaSurat(TugasSurat09 surat) {
        if (!isFull()) {
            top++;
            dataSurat[top] = surat;
            System.out.println("Surat izin berhasil diterima.");
        } else {
            System.out.println("Tumpukan surat penuh! Surat tidak dapat diterima.");
        }
    }

    public TugasSurat09 prosesSurat() {
        if (!isEmpty()) {
            TugasSurat09 surat = dataSurat[top];
            top--;
            return surat;
        } else {
            System.out.println("Tidak ada surat izin yang dapat diproses.");
            return null;
        }
    }

    public TugasSurat09 lihatSuratTerakhir() {
        if (!isEmpty()) {
            return dataSurat[top];
        } else {
            System.out.println("Belum ada surat izin yang masuk.");
            return null;
        }
    }

    public void cariSurat(String namaMahasiswa) {
        boolean ditemukan = false;

        for (int i = top; i >= 0; i--) {
            if (dataSurat[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat izin ditemukan:");
                tampilkanSurat(dataSurat[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Surat izin atas nama " + namaMahasiswa + " tidak ditemukan.");
        }
    }

    public void tampilkanSurat(TugasSurat09 surat) {
        System.out.println("ID Surat       : " + surat.idSurat);
        System.out.println("Nama Mahasiswa : " + surat.namaMahasiswa);
        System.out.println("Kelas          : " + surat.kelas);
        System.out.println("Jenis Izin     : " + surat.jenisIzin);
        System.out.println("Durasi         : " + surat.durasi + " hari");
    }
}
