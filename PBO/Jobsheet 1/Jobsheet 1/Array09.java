import java.util.Scanner;

public class Array09 {


    static String konversiHuruf(double nilai){
        if(nilai >= 85) return "A";
        else if(nilai >= 75) return "B+";
        else if(nilai >= 65) return "B";
        else if(nilai >= 50) return "C+";
        else if(nilai >= 45) return "C";
        else if(nilai >= 40) return "D";
        else return "E";
    }


    static double konversiBobot(String huruf){
        switch(huruf){
            case "A": return 4;
            case "B+": return 3.5;
            case "B": return 3;
            case "C+": return 2.5;
            case "C": return 2;
            case "D": return 1;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] mk = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };


        int[] sks = {2,2,2,3,2,3,2,2};

        double[] nilaiAngka = new double[mk.length];
        String[] nilaiHuruf = new String[mk.length];
        double[] bobot = new double[mk.length];

        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");


        for(int i=0;i<mk.length;i++){
            System.out.print("Masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            nilaiHuruf[i] = konversiHuruf(nilaiAngka[i]);
            bobot[i] = konversiBobot(nilaiHuruf[i]);
        }


        System.out.println("\nHasil Konversi Nilai");
        System.out.println("==========================================================================");
        System.out.printf("%-40s %-12s %-12s %-12s\n","MK","Nilai Angka","Nilai Huruf","Bobot Nilai");

        double totalBobotSKS = 0;
        int totalSKS = 0;

        for(int i=0;i<mk.length;i++){
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                    mk[i], nilaiAngka[i], nilaiHuruf[i], bobot[i]);

            totalBobotSKS += bobot[i] * sks[i]; 
            totalSKS += sks[i];
        }

        double IP = totalBobotSKS / totalSKS;

        System.out.println("==========================================================================");
        System.out.printf("IP : %.2f\n", IP);
    }
}
