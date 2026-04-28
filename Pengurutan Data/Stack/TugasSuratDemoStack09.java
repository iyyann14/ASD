import java.util.Scanner;

public class TugasSuratDemoStack09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TugasStackSurat09 stack = new TugasStackSurat09(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Teratas");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();

                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();

                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().charAt(0);

                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    TugasSurat09 srt = new TugasSurat09(id, nama, kelas, jenis, durasi);
                    stack.terimaSurat(srt);

                    System.out.println("Surat berhasil ditambahkan.");
                    break;

                case 2:
                    TugasSurat09 proses = stack.prosesSurat();

                    if (proses != null) {
                        System.out.println("Memproses surat dari " + proses.namaMahasiswa);
                    }
                    break;

                case 3:
                    TugasSurat09 lihat = stack.lihatSuratTerakhir();

                    if (lihat != null) {
                        System.out.println("Surat terakhir dari " + lihat.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama: ");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari);
                    break;

                case 5:
                    System.out.println("Keluar program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 5);

        sc.close();
    }
}