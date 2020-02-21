public class Queue {
    LinkedList L;

    public Queue() {

    }

    public void enqueue(String text) {
        Node newNode = new Node(text, null);
        L.addLast(newNode);
    }

    public String dequeue() {
        Node check = L.removeFirst();
        String check1;
        if (check == null) {
            check1 = null;
        } else {
            check1 = check.getData();
        }
        return check1;
    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return -1;
    }
}
