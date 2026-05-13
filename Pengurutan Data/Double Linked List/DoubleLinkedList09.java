import org.w3c.dom.Node;

public class DoubleLinkedList09 {
    NodeDouble09 head;
    NodeDouble09 tail;
    int size = 0;

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
        size++;
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
        size++;
    }

    public void insertAfter(String keyNim, MahasiswaDLL09 data) {
        NodeDouble09 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data Dengan NIM " + keyNim + " Tidak Ditemukan.");
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

        System.out.println("Data Berhasil Disisipkan Setelah NIM " + keyNim);
    }


    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List Masih Kosong.");
            return;
        }
        NodeDouble09 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("--------------------");
            current = current.next;
        }
    }

   
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List Masih Kosong.");
            return;
        }
        System.out.println("=== Data Terbalik (Tail ke Head) ===");
        NodeDouble09 current = tail;
        while (current != null) {
            current.data.tampil();
            System.out.println("--------------------");
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong.");
            return;
        }

        System.out.println("Data yang Dihapus:");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
        System.out.println("Data Berhasil Dihapus.");
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong.");
            return;
        }

        System.out.println("Data yang Dihapus:");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        System.out.println("Data Berhasil Dihapus.");
    }

    // TUGAS 1 
    public void add(int index, MahasiswaDLL09 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks Tidak Valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }

        NodeDouble09 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        NodeDouble09 newNode   = new NodeDouble09(data);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
        size++;
        System.out.println("Data Berhasil Ditambahkan pada Indeks " + index);
    }

        // TUGAS 2 
    public void removeAfter(String keyNim) {
        NodeDouble09 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("NIM " + keyNim + " Tidak Ditemukan.");
            return;
        }
        if (current.next == null) {
            System.out.println("Tidak Ada Node Setelah NIM " + keyNim + ".");
            return;
        }

        NodeDouble09 toDelete = current.next;
        System.out.println("Data yang Dihapus:");
        toDelete.data.tampil();

        if (toDelete == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = toDelete.next;
            toDelete.next.prev = current;
        }
        size--;
        System.out.println("Data Berhasil Dihapus.");
    }

    // TUGAS 3 
    public void remove(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks Tidak Valid atau List Kosong.");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }

        NodeDouble09 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        System.out.println("Data yang Dihapus:");
        temp.data.tampil();

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
        System.out.println("Data Berhasil Dihapus.");
    }

    // TUGAS 4a 
    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Masih Kosong.");
            return;
        }
        System.out.println("=== Data Pertama ===");
        head.data.tampil();
    }

    // TUGAS 4b 
    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List Masih Kosong.");
            return;
        }
        System.out.println("=== Data Terakhir ===");
        tail.data.tampil();
    }

    // TUGAS 4c 
    public void getIndex(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks Tidak Valid atau List Kosong.");
            return;
        }
        NodeDouble09 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        System.out.println("=== Data Pada Indeks " + index + " ===");
        temp.data.tampil();
    }

    // TUGAS 5 
    public int getSize() {
        return size;
    }
}