package myutils.list;

public class Node {

    private int payload;
    private Node next;
    private Node previous;

    public Node(int payload, Node next, Node previous) {
        this.payload = payload;
        this.next = next;
        this.previous = previous;
    }

    public String toString() {
        return "" + payload;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext() {
        return next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    public Node getPrevious() {
        return previous;
    }
    
    public int getPayload() {
        return payload;
    }
}
