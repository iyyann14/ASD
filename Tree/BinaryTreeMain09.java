package ASD.Tree;

public class BinaryTreeMain09 {
    public static void main(String[] args) {

        BinaryTree09 bst = new BinaryTree09();

        bst.add(new MahasiswaTree09("244160121", "Ali", "A", 3.57));
        bst.add(new MahasiswaTree09("244160221", "Badar", "B", 3.85));
        bst.add(new MahasiswaTree09("244160185", "Candra", "C", 3.21));
        bst.add(new MahasiswaTree09("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar Semua Mahasiswa (InOrder Traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian Data Mahasiswa:");
        System.out.print("Cari Mahasiswa Dengan Ipk: 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari Mahasiswa Dengan Ipk: 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new MahasiswaTree09("244160131", "Devi", "A", 3.72));
        bst.add(new MahasiswaTree09("244160205", "Ehsan", "D", 3.37));
        bst.add(new MahasiswaTree09("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar Semua Mahasiswa Setelah Penambahan 3 Mahasiswa:");
        System.out.println("InOrder Traversal       :");
        bst.traverseInOrder(bst.root);
        System.out.println("");
        System.out.println("\nPreOrder Traversal    :");
        bst.traversePreOrder(bst.root);
        System.out.println("");
        System.out.println("\nPostOrder Traversal   :");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan Data Mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar Semua Mahasiswa Setelah Penghapusan 1 Mahasiswa (InOrder Traversal):");
        bst.traverseInOrder(bst.root);
    }
}
