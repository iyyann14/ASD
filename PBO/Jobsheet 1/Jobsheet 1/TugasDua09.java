import java.util.Scanner;

public class TugasDua09 {

    static Scanner sc = new Scanner(System.in);
    static String[][] jadwal;


    static void inputJadwal(int n){
        jadwal = new String[n][4];

        for(int i=0;i<n;i++){
            System.out.println("\nJadwal ke-" + (i+1));
            System.out.print("Nama MK : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang   : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari    : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam     : ");
            jadwal[i][3] = sc.nextLine();
        }
    }


    static void tampilSemua(int n){
        System.out.println("\n=== JADWAL KULIAH ===");
        System.out.println("MK\t\t\tRuang\t\t\tHari\t\tJam");

        for(int i=0;i<n;i++){
            System.out.println(jadwal[i][0]+"\t"+jadwal[i][1]+"\t"+jadwal[i][2]+"\t\t"+jadwal[i][3]);
        }
    }


    static void cariHari(int n){
        System.out.print("\nCari jadwal hari : ");
        String hari = sc.nextLine();

        for(int i=0;i<n;i++){
            if(jadwal[i][2].equalsIgnoreCase(hari)){
                System.out.println(jadwal[i][0]+" == "+jadwal[i][3]+" == "+jadwal[i][1]);
            }
        }
    }


    static void cariMK(int n){
        System.out.print("\nCari Mata Kuliah : ");
        String mk = sc.nextLine();

        for(int i=0;i<n;i++){
            if(jadwal[i][0].equalsIgnoreCase(mk)){
                System.out.println("Hari : "+jadwal[i][2]);
                System.out.println("Jam  : "+jadwal[i][3]);
                System.out.println("Ruang: "+jadwal[i][1]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Jumlah jadwal kuliah : ");
        int n = sc.nextInt();
        sc.nextLine();

        inputJadwal(n);
        tampilSemua(n);
        cariHari(n);
        cariMK(n);
    }
}
