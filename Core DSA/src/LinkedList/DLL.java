package LinkedList;

public class DLL {
    private Node head;
    private Node tail;

    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        } else {
            tail = node;
        }
        head = node;
    }

    public void insertAtLast(int val) {
        if (head == null) {
            insertAtFirst(val);
            return;
        }

        Node node = new Node(val);

        node.next = null;

        tail.next = node;
        node.prev = tail;
        tail = node;

    }

    public void insert(int idx, int val) {
        if (idx < 0) {
            System.out.println("Invalid idx : cannot be negative...");
            return;
        }
        // insert in first idx
        if (idx == 0) {
            insertAtFirst(val);
            return;
        }

        Node last = getNode(idx - 1);
        if (last == null) {
            System.out.println("Index out of bound...");
            return;
        }

        Node node = new Node(val);

        node.prev = last;
        node.next = last.next;

        if (last.next != null) {
            last.next.prev = node;
        } else {
            tail = node;
        }

        last.next = node;
    }

    public void insertAfter(int after, int val) {
        Node p = findNode(after);

        if (p == null) {
            System.out.println("Value does not exist...");
            return;
        }

        Node node = new Node(val);

        node.next = p.next;
        node.prev = p;
        p.next = node;
        if (node.next != null) {
            node.next.prev = node;
        } else {
            tail = node;
        }
    }

    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is already empty...");
            return -1;
        }

        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }

        return val;
    }

    public int deleteLast() {
        if (head == null) {
            System.out.println("List is already empty...");
            return -1;
        }

        // Node last = head;
        // if(last.next == null) {
        // int val = head.value;
        // head = null;
        // return val;
        // }
        // while(last.next != null) {
        // last = last.next;
        // }

        // int val = last.value;

        // last.prev.next = null;
        // last.prev = null;

        // return val;

        int val = tail.value;

        if (head.next == null) {
            head = null;
            tail = null;
            return val;
        }

        tail = tail.prev;
        tail.next = null;

        return val;
    }

    public int delete(int idx) {
        if (idx < 0 || head == null) {
            System.out.println("Invalid idx...");
            return -1;
        }

        if (idx == 0) {
            return deleteFirst();
        }

        Node toDelete = getNode(idx);
        if (toDelete == null) {
            System.out.println("Index out of bound...");
            return -1;
        }

        int val = toDelete.value;

        if (toDelete.next == null) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = toDelete.prev;
                tail.next = null;
                toDelete.prev = null;
            }
        } else {
            toDelete.prev.next = toDelete.next;
            toDelete.next.prev = toDelete.prev;
        }

        return val;
    }

    public int get(int idx) {
        Node node = getNode(idx);

        if (node == null) {
            System.out.println("Index out of bounds...");
            return -1;
        }

        return node.value;
    }

    public Node findNode(int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }

    public Node getNode(int idx) {
        if (idx < 0 || head == null) {
            return null;
        }

        Node node = head;

        for (int i = 0; i < idx; i++) {
            if (node == null){
                return null;
            }
            node = node.next;
        }

        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
