public class DoubleLinkedList09 {
    NodeDouble09 head;
    NodeDouble09 tail;

    public DoubleLinkedList09() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(MahasiswaDLL09 data) {
        NodeDouble09 newNode = new NodeDouble09(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(MahasiswaDLL09 data) {
        NodeDouble09 newNode = new NodeDouble09(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, MahasiswaDLL09 data) {
        NodeDouble09 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        NodeDouble09 newNode = new NodeDouble09(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }


    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        NodeDouble09 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("--------------------");
            current = current.next;
        }
    }

   
    // public void printReverse() {
    //     if (isEmpty()) {
    //         System.out.println("Linked List masih kosong.");
    //         return;
    //     }
    //     System.out.println("=== Data Terbalik (tail ke head) ===");
    //     NodeDouble09 current = tail;
    //     while (current != null) {
    //         current.data.tampil();
    //         System.out.println("--------------------");
    //         current = current.prev;
    //     }
    // }
}