package LinkedList;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertAtFirst(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertAtLast(int val) {
        if (tail == null) {
            insertAtFirst(val);
            return;
        }
        Node temp = new Node(val);
        tail.next = temp;
        tail = temp;
        size += 1;
    }

    public void insert(int idx, int val) {
        if (idx == 0) {
            insertAtFirst(val);
            return;
        }
        if (idx == size) {
            insertAtLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size += 1;
    }

    public void insertRec(int idx, int val) {
        head = insertRec(head, idx, val);
    }

    private Node insertRec(Node node, int idx, int val) {
        if (idx == 0) {
            Node temp = new Node(val, node);
            size++;

            return temp;
        }

        node.next = insertRec(node.next, idx - 1, val);

        return node;
    }

    public void deleteDuplicates() {
        if (head == null || head.next == null) {
            tail = head;
            return;
        }
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;
    }

    public int get(int idx) {
        if (idx == 0) {
            return head.value;
        }
        if (idx == size - 1) {
            return tail.value;
        }

        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }

        return temp.value;
    }

    public int deleteFirst() {
        int x = head.value;

        head = head.next;

        if (head == null) {
            tail = null;
        }

        size -= 1;

        return x;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = getNode(size - 2);

        int x = tail.value;

        tail = secondLast;
        tail.next = null;

        size -= 1;

        return x;
    }

    public int delete(int idx) {
        if (idx == 0) {
            return deleteFirst();
        }
        if (idx == size - 1) {
            return deleteLast();
        }

        Node prev = getNode(idx - 1);

        int val = prev.next.value;

        prev.next = prev.next.next;

        size -= 1;

        return val;
    }

    public Node getNode(int idx) {
        Node node = head;

        for (int i = 0; i < idx; i++) {
            node = node.next;
        }

        return node;
    }

    public Node findNode(int value) {
        Node node = head;

        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }

        return null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void reverseList() {
        reverseList(null, head);
    }

    private void reverseList(Node prev, Node curr) {
        if (curr == null) {
            return;
        }

        reverseList(curr, curr.next);
        curr.next = prev;

        if (curr == head) {
            Node temp = tail;
            tail = head;
            head = temp;
        }
    }

    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            Node first = getNode(c);
            Node second = getNode(c + 1);

            if (first.value > second.value) {
                // swap
                first.next = second.next;
                second.next = first;
                if (c == 0) {
                    head = second;
                } else {
                    Node prev = getNode(c - 1);
                    prev.next = second;
                }
                if (second == tail) {
                    tail = first;
                    tail.next = null;
                }
            }
            bubbleSort(r, c + 1);
        } else {
            bubbleSort(r - 1, 0);
        }
    }

    private void bubbleSort(Node end) {
        if (head == end || head.next == end) {
            return;
        }

        Node first = head;
        Node prev = null; // at start prev is null

        while (first.next != end) {
            Node second = first.next;
            if (first.value > second.value) {
                // swap
                first.next = second.next;
                second.next = first;

                // Update the head if we're swapping at the start
                if (prev == null) {
                    head = second;
                } else {
                    prev.next = second;
                }

                if (second == tail) {
                    tail = first;
                }

                prev = second;
            } else {
                prev = first;
                first = first.next;
            }
        }
        // After one full pass, the largest node is at 'first' (position before 'end')
        // Recurse with 'first' as the new end (for remaining unsorted list)
        bubbleSort(first);
    }

    // merge sorted LinkedList
    public static LL mergeList(LL l1, LL l2) {
        LL merge = new LL();

        Node head1 = l1.head;

        Node head2 = l2.head;

        while (head1 != null && head2 != null) {
            if (head1.value <= head2.value) {
                merge.insertAtLast(head1.value);
                head1 = head1.next;
            } else {
                merge.insertAtLast(head2.value);
                head2 = head2.next;
            }
        }

        while (head1 != null) {
            merge.insertAtLast(head1.value);
            head1 = head1.next;
        }

        while (head2 != null) {
            merge.insertAtLast(head2.value);
            head2 = head2.next;
        }

        return merge;
    }

    // https://leetcode.com/problems/merge-two-sorted-lists/description/
    public Node merge(Node head1, Node head2) {
        Node dummyHead = new Node();

        Node temp = dummyHead;

        while (head1 != null && head2 != null) {
            if (head1.value <= head2.value) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        temp.next = (head1 != null) ? head1 : head2;

        return dummyHead.next;
    }

    // https://leetcode.com/problems/linked-list-cycle/description/
    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // length of cycle in list
    public int cycleLength(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            int len = 0;

            if (slow == fast) {
                // start counting cycle length
                do {
                    slow = slow.next;
                    len++;
                } while (slow != fast);

                return len;
            }
        }

        return 0; // no cycle
    }

    public int recSearch(int key) {
        return recSearchHelper(head, key, 0);
    }

    public int recSearchHelper(Node temp, int key, int idx) {
        if (temp == null) {
            return -1;
        }

        if (temp.value == key) {
            return idx;
        }
        return recSearchHelper(temp.next, key, idx + 1);
    }

    public void reverse() { 
        if(size < 2) {
            return;
        }
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        tail = head;
        head = prev;
    }

    public static void main(String[] args) {
        // LL first = new LL();
        // LL second = new LL();

        // first.insertAtFirst(1);
        // first.insertAtLast(2);
        // first.insertAtLast(2);
        // first.insertAtLast(4);

        // second.insertAtLast(1);
        // second.insertAtLast(3);
        // second.insertAtLast(7);
        // second.insertAtLast(9);

        // LL ans = mergeList(first, second);

        // ans.display();

        LL list = new LL();
        for (int i = 7; i > 0; i--) {
            list.insertAtFirst(i);
        }

        // list.display();

        // list.bubbleSort(null);

        list.display();
        System.out.println("head -> " + list.head.value);
        System.out.println("tail -> " + list.tail.value);

        list.reverse();

        list.display();
        System.out.println("head -> " + list.head.value);
        System.out.println("tail -> " + list.tail.value);

        // LL list = new LL();

        // list.insertAtFirst(6);
        // list.insertAtLast(2);
        // list.insertAtLast(18);
        // list.insertAtLast(45);
        // list.insertAtFirst(7);

        // list.display();

        // System.out.println(list.recSearch(45));
    }
}
