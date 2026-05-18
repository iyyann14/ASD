package CaseMethod2;

public class NodePesanan09 {
    Pesanan09 data;
    NodePesanan09 prev;
    NodePesanan09 next;

    public NodePesanan09(NodePesanan09 prev, Pesanan09 data, NodePesanan09 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}