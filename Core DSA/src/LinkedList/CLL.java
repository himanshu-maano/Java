package LinkedList;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            node.next = node;

        } else {
            tail.next = node;
            node.next = head;
            head = node;
        }

        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            node.next = node;

        } else {

            tail.next = node;
            node.next = head;
            tail = node;
        }
        size++;
    }

    public void insert(int idx, int val) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index...");
            return;
        }

        if (idx == 0) {
            insertFirst(val);
            return;
        }

        if (idx == size) {
            insertLast(val);
            return;
        }

        Node temp = getNode(idx - 1);

        if (temp == null) {
            System.out.println("Index out of bound...");
            return;
        }

        Node node = new Node(val);

        node.next = temp.next;
        temp.next = node;

        size++;
    }

    public int get(int idx) {

        Node temp = getNode(idx);

        if (temp == null) {
            System.out.println("Index out of bound...");
            return -1;
        }

        return temp.value;
    }

    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty...");
            return -1;
        }

        int val = head.value;

        if (head == tail) {
            head = tail = null;

        } else {

            head = head.next;
            tail.next = head;
        }

        size--;

        return val;
    }

    public int deleteLast() {
        if (head == null) {
            System.out.println("List is Empty...");
            return -1;
        }

        int val = tail.value;

        if (head == tail) {
            head = tail = null;

        } else {

            Node temp = head;

            while (temp.next != tail) {
                temp = temp.next;
            }

            tail = temp;
            tail.next = head;
        }

        size--;

        return val;
    }

    public int delete(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Index out of bound...");
            return -1;
        }

        if (idx == 0) {
            return deleteFirst();
        }

        if (idx == size - 1) {
            return deleteLast();
        }

        Node prev = getNode(idx - 1);

        int val = prev.next.value;

        prev.next = prev.next.next;

        size--;

        return val;
    }

    public int deleteValue(int value) {
        if (head == null) {
            System.out.println("List is Empty...");
            return -1;
        }

        Node temp = head;
        int idx = 0;

        do {
            if (temp.value == value) {
                return delete(idx);
            }
            temp = temp.next;
            idx++;
        } while (temp != head);

        System.out.println("Value not found...");
        return -1;
    }

    public Node findNode(int val) {
        Node temp = head;

        if (head != null) {
            do {
                if (temp.value == val) {
                    return temp;
                }
                temp = temp.next;
            } while (temp != head);

        }

        return null;
    }

    public Node getNode(int idx) {
        if (idx < 0 || idx >= size || head == null) {
            return null;
        }

        Node node = head;

        for (int i = 0; i < idx; i++) {
            node = node.next;
        }

        return node;
    }

    public void display() {
        Node temp = head;

        if (head != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);

            System.out.println("(Bach to Head)");
        }
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
