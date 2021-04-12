package myutils.list;

public class List {
    private Node head;
    private Node tail;
    private int size;

    public List() {
        head = null;
        tail = null;
        size = 0;
    }

    public void push(int v) {
        if (size == 0) {
            Node n = new Node(v, null, null);
            n.setNext(n);
            n.setPrevious(n);
            head = n;
            tail = n;
        }
        else {
            Node n = new Node(v, head, tail);
            tail.setNext(n);
            tail = n;
        }
        size += 1;
    }

    public void push(int[] t) {
        for (int i = 0; i < t.length; i++) {
            push(t[i]);
        }
    }

    public int pop() {
        Node newTail = tail.getPrevious();
        newTail.setNext(head);
        head.setPrevious(newTail);
        int v = tail.getPayload();
        tail = newTail;
        size -= 1;
        if (size == 0) {
            head = null;
            tail = null;
        }
        return v;
    }

    public int[] toArray() {
        int[] out = new int[size];
        Node c = head;
        for (int i = 0; i < size; i++) {
            out[i] = c.getPayload();
            c = c.getNext();
        }
        return out;
    }

    public List clone() {
        List newList = new List();
        int[] t = toArray();
        newList.push(t);
        return newList;
    }

    public void push(List otherList) {
        int[] t = otherList.toArray();
        push(t);
    }

    public String toString() {
        String out = "[";
        Node c = head;
        for (int i = 0; i < size; i++) {
            out += c + ", ";
            c = c.getNext();
        }
        return out + "]";
    }


    public int sum() {
        int total = 0;
        Node c = head;
        for (int i = 0; i < size; i++) {
            total += c.getPayload();
            c = c.getNext();
        }  
        return total;
    }

    public double mean() {
        if (isEmpty()) {
            return 0;
        }
        return ((double)sum()) / size;
    }

    public int max() {
        Node c = head;
        int max = c.getPayload();
        for (int i = 1; i < size; i++) {
            c = c.getNext();
            int current = c.getPayload();
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    public int maxI() {
        Node c = head;
        int max = c.getPayload();
        int maxI = 0;
        for (int i = 1; i < size; i++) {
            c = c.getNext();
            int current = c.getPayload();
            if (current > max) {
                max = current;
                maxI = i;
            }
        }
        return maxI;
    }


    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
   
}
