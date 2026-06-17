public class PeminjamanManager09 {
    private Peminjaman09[] listPeminjaman;
    private boolean isSortedByNIM = false;

    public PeminjamanManager09(Peminjaman09[] listPeminjaman) {
        this.listPeminjaman = listPeminjaman;
    }

    public void tampilkanSemua() {
        for (Peminjaman09 p : listPeminjaman) {
            p.tampil();
        }
    }

    public void urutkanDendaDesc() {
        for (int i = 1; i < listPeminjaman.length; i++) {
            Peminjaman09 temp = listPeminjaman[i];
            int j = i - 1;
            while (j >= 0 && listPeminjaman[j].getDenda() < temp.getDenda()) {
                listPeminjaman[j + 1] = listPeminjaman[j];
                j--;
            }
            listPeminjaman[j + 1] = temp;
        }
        isSortedByNIM = false;
    }

    public void urutkanNIMAsc() {
        if (isSortedByNIM) return;

        for (int i = 1; i < listPeminjaman.length; i++) {
            Peminjaman09 temp = listPeminjaman[i];
            int j = i - 1;
            while (j >= 0 && Integer.parseInt(listPeminjaman[j].getMhs().getNim()) > Integer.parseInt(temp.getMhs().getNim())) {
                listPeminjaman[j + 1] = listPeminjaman[j];
                j--;
            }
            listPeminjaman[j + 1] = temp;
        }
        isSortedByNIM = true;
    }

    public void cariNIM(int nimCari) {
        urutkanNIMAsc();
        int left = 0;
        int right = listPeminjaman.length - 1;
        int indexFound = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int nimMid = Integer.parseInt(listPeminjaman[mid].getMhs().getNim());

            if (nimMid == nimCari) {
                indexFound = mid;
                break;
            } else if (nimMid < nimCari) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (indexFound != -1) {
            System.out.println("\n=== DATA DITEMUKAN ===");

            // Search backwards for other occurrences
            int start = indexFound;
            while (start > 0 && Integer.parseInt(listPeminjaman[start - 1].getMhs().getNim()) == nimCari) {
                start--;
            }

            // Print all matches from start
            while (start < listPeminjaman.length && Integer.parseInt(listPeminjaman[start].getMhs().getNim()) == nimCari) {
                listPeminjaman[start].tampil();
                start++;
            }
        } else {
            System.out.println("Data tidak ditemukan untuk NIM: " + nimCari);
        }
    }
}
