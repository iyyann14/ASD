package ASD.Tree;

public class BinaryTree09 {
    NodeTree09 root;

    public BinaryTree09() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(MahasiswaTree09 mahasiswa) {
        NodeTree09 newNode = new NodeTree09(mahasiswa);

        if (isEmpty()) {
            root = newNode;
        } else {
            NodeTree09 current = root;
            NodeTree09 parent = null;

            while (true) {
                parent = current;

                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void addRekursif(MahasiswaTree09 mahasiswa) {
        root = addRekursifHelper(root, mahasiswa);
    }

    private NodeTree09 addRekursifHelper(NodeTree09 node, MahasiswaTree09 mahasiswa) {
        if (node == null) {
            return new NodeTree09(mahasiswa);
        }

        if (mahasiswa.ipk < node.mahasiswa.ipk) {
            node.left = addRekursifHelper(node.left, mahasiswa);
        } else {
            node.right = addRekursifHelper(node.right, mahasiswa);
        }

        return node;
    }

    boolean find(double ipk) {
        boolean result = false;
        NodeTree09 current = root;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(NodeTree09 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(NodeTree09 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(NodeTree09 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    NodeTree09 getSuccessor(NodeTree09 del) {
        NodeTree09 successorParent = del;
        NodeTree09 successor = del.right;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        // Cari node (current) yang akan dihapus
        NodeTree09 parent = root;
        NodeTree09 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        // Penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            // KASUS 1: Node tidak punya anak (leaf)
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            }
            // KASUS 2a: Node hanya punya 1 anak (kanan)
            else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            }
            // KASUS 2b: Node hanya punya 1 anak (kiri)
            else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            }
            // KASUS 3: Node punya 2 anak
            else {
                NodeTree09 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();

                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        // Node paling kiri = IPK terkecil
        NodeTree09 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK terkecil:");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        // Node paling kanan = IPK terbesar
        NodeTree09 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IPK terbesar:");
        current.mahasiswa.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilIPKdiAtasHelper(root, ipkBatas);
    }

    private void tampilIPKdiAtasHelper(NodeTree09 node, double ipkBatas) {
        if (node != null) {
            // InOrder agar urut: kiri dulu
            tampilIPKdiAtasHelper(node.left, ipkBatas);
            // Cetak jika IPK di atas batas
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilIPKdiAtasHelper(node.right, ipkBatas);
        }
    }
}
