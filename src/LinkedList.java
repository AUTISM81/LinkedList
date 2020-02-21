/**
 * Linked list to be used as a queue. Only needs addLast and removeFirst (enqueue and dequeue) together with
 * size() and isEmpty().
 * Created 2020-02-14
 */
public class LinkedList {
    Node first;
    Node LastNode;
    int size;


    /**
     * Constructor to create an empty list.
     */
    public LinkedList() {
        first = null;
    }

    /**
     * Adds a new Node to the list. The Node is always added last. There's a special case when the list is empty
     * (first=null). Make sure to solve that properly...
     * @param newNode
     */
    public void addLast(Node newNode) {
        size++;
        if (first == null){
            first = newNode;
            LastNode = first;
        } else {
            LastNode = LastNode.next;
            LastNode = newNode;
        }

    }

    /**
     * Removes and returns the first element of the list. Check if the list is empty and return null in that case
     * (bad practice, should throw an Exception)
     * @return
     */
    public Node removeFirst() {
        //checks if first is null and in that case just returns it.
        //if first would not be null it would make first be the next one in the list.
        size--;
        Node CurrentNode = first;
        if (first != null) {
            first = first.next;
        }
        return CurrentNode;
    }

    /**
     * Return the size of the queue. Either implement as a loop calculating at each call (go through the nodes,
     * counting as you go OR use an internal variable (private int size) to continuously keep track of the queue-size).
     * Could be used by isEmpty...
     * @return
     */
    public int size() {
        /*//variables
        boolean size = false;
        int ListSize = 0;
        Node CurrentNode = first;

        //checks how many there are in the list
        while (size = false){
            if (CurrentNode != null){
                //adds one for everytime the next node is not null
                size += 1;
                //moves on to check next node
                CurrentNode = CurrentNode.next;
            } else {
                //stops if node is null
                size = true;
            }
        }*/
        return size;
    }

    /**
     * returns true if the queue is empty.
     * @return
     */
    public boolean isEmpty() {
        return size() == 0;
    }

}