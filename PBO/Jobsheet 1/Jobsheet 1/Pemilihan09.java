import java.util.Scanner;

public class Pemilihan09 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String huruf;
    
    System.out.println("Program Menghitung Nilai Akhir");
    System.out.println("==============================");

    System.out.print("Masukkan Nilai Tugas: ");
    double tugas = sc.nextDouble();

    System.out.print("Masukkan Nilai Kuis: ");
    double kuis = sc.nextDouble();

    System.out.print("Masukkan Nilai UTS: ");
    double uts = sc.nextDouble();

    System.out.print("Masukkan Nilai UAS: ");
    double uas = sc.nextDouble();

    System.out.println("==============================");
    System.out.println("==============================");
    
    if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
        System.out.println("Nilai Tidak Valid!");
        return;
    }

    double nilaiAkhir = tugas*0.2 + kuis*0.2 + uts*0.3 + uas*0.4; 

    if (nilaiAkhir >= 85) {
        huruf = "Nilai Huruf : A";
    } else if (nilaiAkhir >= 80) {
        huruf = "Nilai Huruf : B+";
    } else if (nilaiAkhir >= 75) {
        huruf = "Nilai Huruf : B";
    } else if (nilaiAkhir >= 70) {
        huruf = "Nilai Huruf : C+";
    } else if (nilaiAkhir >= 60) {
        huruf = "Nilai Huruf : C";
    } else if (nilaiAkhir >= 50) {
        huruf = "Nilai Huruf : D";
    }
     else {
        huruf = "Nilai Huruf : E";
    }

    System.out.println("==============================");
    System.out.println("Nilai Akhir: " + nilaiAkhir);
    System.out.println(huruf);
    System.out.println("==============================");

    if(huruf.equals("Nilai Huruf : D") || huruf.equals("Nilai Huruf : E")) {
    System.out.println("ANDA TIDAK LULUS");
    } else {
    System.out.println("SELAMAT ANDA LULUS!");
    }
  }
}