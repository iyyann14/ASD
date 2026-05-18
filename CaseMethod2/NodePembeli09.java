package CaseMethod2;

public class NodePembeli09 {
    int noAntrian;
    Pembeli09 data;
    NodePembeli09 next;
    NodePembeli09 prev;

    public NodePembeli09(int noAntrian, Pembeli09 data, NodePembeli09 next, NodePembeli09 prev) {
        this.noAntrian = noAntrian;
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}