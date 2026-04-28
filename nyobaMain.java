public class nyobaMain {
    public static void main(String[] args) {

        nyoba sp = new nyoba();
        int[] data1 = {5, 2, 9, 1, 3};
        int[] data2 = {5, 2, 9, 1, 3};
        int[] data3 = {5, 2, 9, 1, 3};

        System.out.println("Data Awal:");
        sp.tampil(data1);

        // 🔹 Bubble Sort
        sp.bubbleSort(data1);
        System.out.println("Setelah Bubble Sort:");
        sp.tampil(data1);

        // 🔹 Selection Sort
        sp.selectionSort(data2);
        System.out.println("Setelah Selection Sort:");
        sp.tampil(data2);

        // 🔹 Arrays.sort()
        sp.arraySort(data3);
        System.out.println("Setelah Arrays.sort():");
        sp.tampil(data3);
    }
}