package ASD.Tree;

public class BinaryTreeArrayMain09 {
    public static void main(String[] args) {
        BinaryTreeArray09 bta = new BinaryTreeArray09();

        MahasiswaTree09 mhs1 = new MahasiswaTree09("244160121", "Ali", "A", 3.57);
        MahasiswaTree09 mhs2 = new MahasiswaTree09("244160185", "Candra", "C", 3.41);
        MahasiswaTree09 mhs3 = new MahasiswaTree09("244160221", "Badar", "B", 3.75);
        MahasiswaTree09 mhs4 = new MahasiswaTree09("244160220", "Dewi", "B", 3.35);
        MahasiswaTree09 mhs5 = new MahasiswaTree09("244160131", "Devi", "A", 3.48);
        MahasiswaTree09 mhs6 = new MahasiswaTree09("244160205", "Ehsan", "D", 3.61);
        MahasiswaTree09 mhs7 = new MahasiswaTree09("244160170", "Fizi", "B", 3.86);

        MahasiswaTree09[] dataMahasiswas = { mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null };
        int idxLast = 6;

        bta.populateData(dataMahasiswas, idxLast);

        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}
