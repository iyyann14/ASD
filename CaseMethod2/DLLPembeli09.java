package CaseMethod2;

public class DLLPembeli09 {

    NodePembeli09 head;
    NodePembeli09 tail;

    int nomor = 1;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(Pembeli09 pembeli) {

        NodePembeli09 newNode = new NodePembeli09(nomor++, pembeli, null, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan");
    }

    public void tampilAntrian() {
        if (isEmpty()) {

            System.out.println("Antrian kosong");
            return;
        }

        NodePembeli09 current = head;

        System.out.println("========================================");
        System.out.println("         DAFTAR ANTRIAN PEMBELI         ");
        System.out.println("========================================");

        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama","No HP");

        while (current != null) {

            System.out.printf("%-12d %-15s %-15s\n", current.noAntrian, current.data.namaPembeli, current.data.noHp);
            current = current.next;
        }
    }

    public NodePembeli09 hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        NodePembeli09 temp = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return temp;
    }
}
