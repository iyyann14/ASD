public class Sorting09 {

    int[] data;
    int jumlahData;

    void Sorting(int Data[], int jmlDat) {
        jumlahData = jmlDat;
        data = new int[jmlDat];
        for (int i = 0; i < jumlahData; i++) {
            data[i] = Data[i];
        }
    }

    void bubbleSort() {
        int temp = 0;
        for (int i = 1; i < jumlahData - 1; i++) {
            for (int j = 1; j < jumlahData - i; j++) {
                if (data[j - 1] > data[j]) {
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

    void tampil() {
        for (int i = 0; i < jumlahData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    void SelectionSort() {
        for (int i = 0; i < jumlahData - 1; i++) {
            int min = i;
            for (int j = i + 1; j < jumlahData; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }

    void inseertionSort(){
        for (int i = 1; i < jumlahData; i++) {
            int temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }
}