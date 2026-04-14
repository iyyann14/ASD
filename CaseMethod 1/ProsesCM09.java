public class ProsesCM09 {
    public MahasiswaCM09[] mhs;
    public BukuCM09[] buku;
    public PeminjamanCM09[] pinjam;

    public ProsesCM09() {
        mhs = new MahasiswaCM09[] {
                new MahasiswaCM09("22001", "Andi", "Teknik Informatika"),
                new MahasiswaCM09("22002", "Budi", "Teknik Informatika"),
                new MahasiswaCM09("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // DATA BUKU
        buku = new BukuCM09[] {
                new BukuCM09("B001", "Algoritma", 2020),
                new BukuCM09("B002", "Basis Data", 2019),
                new BukuCM09("B003", "Pemrograman", 2021),
                new BukuCM09("B004", "Fisika", 2024)
        };

        // DATA PEMINJAMAN
        pinjam = new PeminjamanCM09[] {
                new PeminjamanCM09(mhs[0], buku[0], 7),
                new PeminjamanCM09(mhs[1], buku[1], 3),
                new PeminjamanCM09(mhs[2], buku[2], 10),
                new PeminjamanCM09(mhs[2], buku[3], 6),
                new PeminjamanCM09(mhs[0], buku[1], 4)
        };

    }

    static void insertionSortByDenda(PeminjamanCM09[] pinjam) {
        // INSERTION SORT
        for (int i = 1; i < pinjam.length; i++) {
            PeminjamanCM09 temp = pinjam[i];
            int j = i - 1;

            while (j >= 0 && pinjam[j].denda < temp.denda) {
                pinjam[j + 1] = pinjam[j];
                j--;
            }
            pinjam[j + 1] = temp;
        }
    }

    static void insertionSortByNIM(PeminjamanCM09[] pinjam) {
        for (int i = 1; i < pinjam.length; i++) {
            PeminjamanCM09 temp = pinjam[i];
            int j = i - 1;

            while (j >= 0 &&
                    Integer.parseInt(pinjam[j].mhs.nim) > Integer.parseInt(temp.mhs.nim)) {
                pinjam[j + 1] = pinjam[j];
                j--;
            }
            pinjam[j + 1] = temp;
        }
    }
    // DATA MAHASISWA

    static void cariNIM(PeminjamanCM09[] pinjam, String cari) {
        int left = 0;
        int right = pinjam.length - 1;
        boolean ditemukan = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            int nimMid = Integer.parseInt(pinjam[mid].mhs.nim);
            int cariI = Integer.parseInt(cari);

            if (nimMid == cariI) {
                System.out.println("\n=== DATA DITEMUKAN ===");
                System.out.println("NIM   : " + pinjam[mid].mhs.nim);
                System.out.println("Nama  : " + pinjam[mid].mhs.nama);
                System.out.println("Buku  : " + pinjam[mid].buku.judul);
                System.out.println("Hari  : " + pinjam[mid].lamaPinjam);
                System.out.println("Denda : " + pinjam[mid].denda);
                ditemukan = true;
                break;
            } else if (nimMid < cariI) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan!");
        }
    }

}