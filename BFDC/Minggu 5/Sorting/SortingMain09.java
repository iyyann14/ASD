public class SortingMain09 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting09 dataurut1 = new Sorting09();
        dataurut1.Sorting(a, a.length);
        System.out.println("Data Awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data Sudah Diurutkan Dengan Bubble Sort (ASC)");
        dataurut1.tampil();


        int b[] = {30, 20, 2, 8, 14};
        Sorting09 dataurut2 = new Sorting09();
        dataurut2.Sorting(b, b.length);
        System.out.println("Data Awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data Sudah Diurutkan Dengan Selection Sort (ASC)");
        dataurut2.tampil();


        int c[] = {40, 10, 4, 9 , 3};
        Sorting09 dataurut3 = new Sorting09();
        dataurut3.Sorting(c, c.length);
        System.out.println("Data Awal 3");
        dataurut3.tampil();
        dataurut3.inseertionSort();
        System.out.println("Data Sudah Diurutkan Dengan Insertion Sort (ASC)");
        dataurut3.tampil();
    }
}