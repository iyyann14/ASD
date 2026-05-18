package CaseMethod2;

public class DLLPesanan09 {

    NodePesanan09 head;
    NodePesanan09 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(Pesanan09 pesanan) {
        NodePesanan09 newNode = new NodePesanan09(null, pesanan, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortPesanan() {
        if (head == null) {
            return;
        }
        
        boolean swapped;
        do {
            swapped = false;
            NodePesanan09 current = head;

            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    Pesanan09 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void tampilPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }
        sortPesanan();

        NodePesanan09 current = head;
        int total = 0;

        System.out.println("==================================================");
        System.out.println("      LAPORAN PESANAN (URUT NAMA PESANAN)         ");
        System.out.println("==================================================");

        System.out.printf("%-10s %-20s %-10s\n", "Kode", "Nama Pesanan", "Harga");

        while (current != null) {
            System.out.printf("%-10d %-20s %-10d\n", current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            total += current.data.harga;
            current = current.next;
        }
        System.out.println("==================================================");
        System.out.println("Total Pendapatan : " + total);
    }
}