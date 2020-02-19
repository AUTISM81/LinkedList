public class Node {
    String data;
    Node next;

    public Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
