import java.util.Scanner;

public class MahasiswaDemoStack09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackTugasMahasiswa09 stack = new StackTugasMahasiswa09(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Tertata");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Melihat Jumlah Tugas");
            System.out.println("7. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    MahasiswaStack09 mhs = new MahasiswaStack09(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s Berhasil Dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    MahasiswaStack09 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai Tugas Dari " + dinilai.nama);
                        System.out.print("Masukkan Nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Tugas %s Dinilai dengan Nilai %d\n", dinilai.nama, dinilai.nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    MahasiswaStack09 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas Terakhir Dikumpulkan Oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar Semua Tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    MahasiswaStack09 terbawah = stack.lihatTerbawah();
                    if (terbawah != null) {
                        System.out.println("Tugas Terbawah Dikumpulkan Oleh " + terbawah.nama);
                    }
                    break;
                case 6:
                    System.out.println("Jumlah Tugas yang Dikumpulkan: " + stack.hitungTugas());
                    break;
                case 7:
                    System.out.println("Keluar dari Program.");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid! Silakan Pilih Menu yang Benar.");
            }
        } while (pilih >= 1 && pilih <= 7);
    }
}